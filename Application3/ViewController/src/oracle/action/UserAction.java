package oracle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.model.User;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class UserAction extends Action {
    @Override
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm,
                                 HttpServletRequest httpServletRequest,
                                 HttpServletResponse httpServletResponse) throws Exception {
        // TODO Implement this method


        User user = (User) actionForm;
        user.setName("thanh");
        user.setAge(15);
        return actionMapping.findForward("success");

    }
}
