package comp.Template;


import com.pla.chatsys.ITempletRetriver;

import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

public class TemplateArch extends AbstractMyxSimpleBrick implements ITempletRetriver
{
    public static final IMyxName msg_ITempletRetriver = MyxUtils.createName("com.pla.chatsys.ITempletRetriver");


	private ITemplateImp _imp;

    public TemplateArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected ITemplateImp getImplementation(){
        try{
			return new TemplateImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		if (arg0.equals(msg_ITempletRetriver)){
			return this;
		}        
		return null;
	}
  
    
    public String[] getTemplet (String code)   {
		return _imp.getTemplet(code);
    }    
}