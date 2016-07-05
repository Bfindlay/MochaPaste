
package controllers;
import play.mvc.Result;
import play.*;
import play.mvc.*;
import views.html.*;
import javax.inject.Inject;
import play.data.DynamicForm;
import play.data.FormFactory;

public class Application extends Controller{
    @Inject
	private FormFactory formFactory;

    public Result index(){
        return ok(index.render("Hello"));
    }

    public Result uploadPaste(){
        DynamicForm requestData = formFactory.form().bindFromRequest();
        String paste = requestData.get("paste");
        //Temp println for paste output
        System.out.println(paste);
        return redirect(routes.Application.index());
    }
}