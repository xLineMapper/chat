package comp.Template;

import annotation.Feature;
import annotation.Optional;


@Optional(Feature.TEMPLATE)
public class TemplateImp implements ITemplateImp
{
	private TemplateArch _arch;

	
    public TemplateImp (){
    }

	public void setArch(TemplateArch arch){
		_arch = arch;
	}
	public TemplateArch getArch(){
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
  
    
    public String[] getTemplet (String code)   {
		String[] result = {"",""};
    	if(code.equals("Hi")){
    		
    		result[0] = "text";
    		result[1] = "Hi How are you?";
    	}else if(code.equals(":)")){
    		result[0] = "image";
    		result[1] = "smile.png";
    	}else if(code.equals("buzz")){
    		result[0] = "multimedia";
    		result[1] = "buzz";
    		
    	}else {
    		
    		result[0] = "text";
    		result[1] = code;
    	}
		return result;
    }
}