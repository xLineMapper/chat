package comp.Template;


import comp.Template.TemplateArch;

public interface ITemplateImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (TemplateArch arch);
	public TemplateArch getArch();
	
	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init();	
	public void begin();
	public void end();
	public void destroy();

	/*
  	  Implementation primitives required by the architecture
	*/
  
    
    public String[] getTemplet (String code)  ;        
}