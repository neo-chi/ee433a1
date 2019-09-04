package core;

/**
 * The Controller class specifies how the user may interact with the 
 * student-course registration model.
 * 
 * @author Reece Youngert a
 */
public class Controller
{
    /** The Model encapsulates the student, course, and registration models. */
    protected Model model;

    /**
     * Returns a Controller object that allows the user to interact with the 
     * student-course registration model.
     */
    public Controller()
    {
        this.model = new Model();
    }

    /**
     * Given a model, action, and parameters, performs the desired task on a
     * student, course, or registration model.
     * 
     * @param model the name of the model.
     * @param action the name of the action.
     * @param parameters the parameters for the given action.
     */
    public void handleRequest(String model, String action, String parameters)
    {
        switch (model) {
            
            case "student":
            switch (action) {

            case "create":
                // TODO student create
                break;

            case "read":
                // TODO student read
                break;

            case "update":
                // TODO student update
                break;

            case "delete":
                // TODO student delete
                break;
            default:
                // TODO: student error
                // TODO: student action help
                break;
            }

            case "course":
            switch (action) {

            case "create":
                // TODO course create
                break;

            case "read":
                // TODO course read
                break;

            case "update":
                // TODO course update
                break;

            case "delete":
                // TODO course delete
                break;

            default:
                // TODO: course error
                // TODO: course action help
                break;
            }

            case "registration":
            switch (action) {

            case "create":
                // TODO registration create
                break;

            case "read":
                // TODO registration read
                break;

            case "update":
                // TODO registration update
                break;

            case "delete":
                // TODO registration delete
                break;

            default:
                // TODO: registration error
                // TODO registration action help
                break;
            }

            default:
                // TODO: model error
                // TODO: model help
                break;
        } // end switch(model)

    } // end handleRequest()

}