import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * Description: A JavaFX based GUI for the Avocado Calculator.
 * @Author Brynn Haley
 */
public class GUI extends Application{

	//Textfield for user to enter a dollar amount
	private TextField tf;
	//Pressing this button displays the result of the calculation
	private Button calculate;
	//Instance of Calculator
	private Calculator calculator;
	private GroceryItem groceryItem;
	//icon Image
	private Image icon;
	private BackgroundImage bg;
	
	public void start(Stage stage){

		calculator = new Calculator(0);
		// Instantiate a Purchasable object according to user selection
		GroceryFactory gfactory = new GroceryFactory();
		//type of grocery item to be selected by user. Because this is AvoCalc, default is "Avocado"
		String type = "Avocado";
		groceryItem = gfactory.getGroceryItem(type);

		icon = new Image("file:img/icon.png");
		stage.setTitle("AvoCalculator");
		stage.getIcons().add(icon);

		//Welcome message
		Text message1 = new Text("Welcome to Avocado Calculator!");
		//Message with instructions to enter dollar amount
		Text message2 = new Text("Enter a dollar amount");
		
		tf = new TextField();
		tf.setPrefWidth(65);

		calculate = new Button("How many avocados is that?");
		calculate.setOnAction(this::eventHandler);
		
		FlowPane pane = new FlowPane(message1, message2, tf, calculate);
		pane.setHgap(15);
		pane.setVgap(20);
		pane.setAlignment(Pos.CENTER);

		Scene scene = new Scene(pane, 250, 260);

		BackgroundImage bg = new BackgroundImage(new Image("file:img/bg.png", 400,400,false,true),
						BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
				
		pane.setBackground(new Background(bg));
		stage.setScene(scene);
		stage.show();
	}

	private void eventHandler(ActionEvent event){
		if(event.getSource() == calculate){
			calculator.setDollars(Integer.parseInt(tf.getText()));
			calculator.calculate(groceryItem);
			//Pops up with the result of the calculation
			Alert alert = new Alert(AlertType.INFORMATION, "");
			alert.setHeaderText("You could buy " + calculator.calculate(groceryItem) + " " +groceryItem.getName() + " with that kind of money!");

			DialogPane dialogPane = alert.getDialogPane();
			bg = new BackgroundImage(new Image("file:img/bg2.png", 200,200,false,true),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);

			dialogPane.setBackground(new Background(bg));
			dialogPane.setPrefWidth(200);

			Stage dialogStage = (Stage) alert.getDialogPane().getScene().getWindow();
				dialogStage.getIcons().add(icon);
			alert.showAndWait();
		}
	}
}