package comp.Bot;

import java.util.HashMap;

import annotation.Feature;
import annotation.Optional;


@Optional(Feature.BOT)
public class BotImp implements IBotImp
{
	private BotArch _arch;
	private HashMap<String, String> map = new HashMap<String, String>();

    public BotImp (){
    }

	public void setArch(BotArch arch){
		_arch = arch;
	}
	public BotArch getArch(){
		return _arch;
	}

	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init(){
	   map.put("Hi", "Hi! I am Bot!");
	   map.put("Hello", "Hello! How are you?");
	   map.put("Help", "Yes! How can I help you?");
	   map.put("Bye", "Bye, See you!");
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
  
    
    public void messageSent (String sender,String message)   {
		if(map.containsKey(message)){
			_arch.OUT_IChat.sendMessage("Bot", map.get(message));
		}
		
    }
}