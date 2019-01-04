package comp.PrintComp;

import java.awt.print.PrinterException;

import javax.swing.JEditorPane;
import javax.swing.JOptionPane;

import annotation.Feature;
import annotation.Optional;


@Optional(Feature.PRINT)
public class PrintCompImp implements IPrintImp
{
	private PrintCompArch _arch;

    public PrintCompImp (){
    }

	public void setArch(PrintCompArch arch){
		_arch = arch;
	}
	public PrintCompArch getArch(){
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

	/*
  	  Implementation primitives required by the architecture
	*/
  
    
    public void print (String msg)   {
		
		JEditorPane transcript = new JEditorPane("text/html", "");
		transcript.setText(msg);
		try {
			boolean complete = transcript.print();
			if (complete)
			{
				JOptionPane.showMessageDialog(null,"Done Printing!","Information",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Printing Aborted !!","Printer",JOptionPane.ERROR_MESSAGE);
			}
		} catch (PrinterException e1) {
			JOptionPane.showMessageDialog(null, e1);
		}
	}
}