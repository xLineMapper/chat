package comp.TTTGame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import annotation.Feature;
import annotation.Optional;


@Optional(Feature.GAME)
public class TTTGameImp implements ITTTGameImp
{
	private TTTGameArch _arch;
	private TicTacToe ttt;

    public TTTGameImp (){
    }

	public void setArch(TTTGameArch arch){
		_arch = arch;
	}
	public TTTGameArch getArch(){
		return _arch;
	}

	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init(){
	}
	public void begin(){
	}
	public void end(){
	}
	public void destroy(){
	}

	public void startTTT (int x, int y)   {
    	
		ttt = new TicTacToe(x, y);
		ttt.addCallBackListner(new ICallBackListner(){

			@Override
			public void buttonClicked(int position) {
				_arch.OUT_ITTTListener.myMove(position);
			}
		});
		ttt.addWindowHandler(new WindowAdapter(){
			  public void windowClosing(WindowEvent evt) {
				    _arch.OUT_ITTTListener.quit();
				  }
		});
		ttt.startGame();
    }
    
    public void endTTT(){
    	ttt.endGame();
    }
    
    public void opponentMove (int position)   {
		if (ttt !=null){
			ttt.isMyTurn = false;
			ttt.buttonClick(position);
		}
    }
	/*
  	  Implementation primitives required by the architecture
	*/
	
	
}