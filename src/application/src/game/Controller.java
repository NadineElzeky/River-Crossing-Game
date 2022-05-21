package game;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import javafx.animation.TranslateTransition;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;



import org.w3c.dom.Document;

import org.w3c.dom.Element;

public class Controller implements ICrosserController{
	public ImageView boat, farmer, goat,plant,fox;

static AlertBox  al=new AlertBox();


	int counter = 0;
	boolean right = true;
	TranslateTransition forward = new TranslateTransition();
	TranslateTransition backward = new TranslateTransition();
	TranslateTransition F = new TranslateTransition();
	TranslateTransition x = new TranslateTransition();
	TranslateTransition g = new TranslateTransition();
	TranslateTransition p = new TranslateTransition();
	TranslateTransition fo = new TranslateTransition();
	TranslateTransition fo2 = new TranslateTransition();


	/*TranslateTransition x3 = new TranslateTransition();
	TranslateTransition x2 = new TranslateTransition();
	TranslateTransition x5 = new TranslateTransition();
	TranslateTransition x6 = new TranslateTransition();
	TranslateTransition x7 = new TranslateTransition();*/


   public  Button S1;
   public Button S2;
   public Button move;

	List<ICrosser> L=new ArrayList<>();


	List<ICrosser> R=new ArrayList<>();


	List<ICrosser> Boat=new ArrayList<>();
	ICrosser i;
	Story1 st=new Story1();
    Story2 st2=new Story2();

	Farmer f=new Farmer();
	Goat Goat=new Goat();
	Fox Fox=new Fox();
	Plant Plant=new Plant();
int flag=0;

//public static  Stage primayStage=new Stage();


	public void newscene(String scenename) throws Exception {
		Stage primaryStage = new Stage();

		Parent root = FXMLLoader.load(getClass().getResource(scenename));
		Scene scene = new Scene(root, 593, 400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("River Crossing Game");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void story1(ActionEvent event) throws Exception {




		Stage stage = (Stage) S1.getScene().getWindow();
		stage.close();
		newscene("/application/Story1.fxml");
		al.Display("Instruction",st.getInstructions());

		}

	public void end(){
		if(L.size()==0) {

			al.Display2("winner",  " "+counter);
			Stage stage = (Stage) move.getScene().getWindow();
			stage.close();

		}
	}

	public void story2(ActionEvent event) throws Exception {

		Stage stage = (Stage) S2.getScene().getWindow();
		stage.close();
		newscene("/application/Story2.fxml");
		al.Display("Instruction",st2.getInstructions());

	}
	public void Initialize2() {
		L.add(Fox);
		L.add(f);
		L.add(Goat);
		L.add(Plant);
	}
/*L=st.getInitialCrossers();
		L=st.getInitialCrossers();
		for (int i=0;i<L.size();i++)
			System.out.println(" "+L.get(i).geteatingrank());
*/


	public void moveboat(ActionEvent event) {

		if (st.isValid(R, L, Boat)) {

			if (isBoatOnTheLeftBank()) {
				if (g.getToX() == 126 && F.getToX() == 250) {
					g.setDuration(Duration.millis(300));
					g.setNode(goat);
					g.setToX(309);
					g.setToY(0);
					g.play();
					F.setDuration(Duration.millis(300));
					F.setNode(farmer);
					F.setToX(454);
					F.setToY(8);
					F.play();
					forward.setDuration(Duration.millis(300));
					forward.setNode(boat);
					forward.setToX(80);
					forward.setToY(0);
					forward.play();
					counter++;

					R.add(f);
					R.add(Goat);
					
					for (int i = 0; i<Boat.size(); i++) {
						if(Boat.get(i) instanceof Farmer)
							Boat.remove(i);
						break;
					}
				
					Boat.remove(f);
					Boat.remove(Goat);
end();

				} else if (p.getToX() == 168 && F.getToX() == 250) {
					p.setDuration(Duration.millis(300));
					p.setNode(plant);
					p.setToX(417);
					p.setToY(13);
					p.play();
					F.setDuration(Duration.millis(300));
					F.setNode(farmer);
					F.setToX(454);
					F.setToY(8);
					F.play();
					forward.setDuration(Duration.millis(300));
					forward.setNode(boat);
					forward.setToX(80);
					forward.setToY(0);
					forward.play();
					counter++;
					R.add(f);
					R.add(Plant);
					Boat.remove(f);
					Boat.remove(Plant);
					end();
				} else if (fo.getToX() == 206 && F.getToX() == 250) {
					fo.setDuration(Duration.millis(300));
					fo.setNode(fox);
					fo.setToX(420);
					fo.setToY(5);
					fo.play();
					F.setDuration(Duration.millis(300));
					F.setNode(farmer);
					F.setToX(454);
					F.setToY(8);
					F.play();
					forward.setDuration(Duration.millis(300));
					forward.setNode(boat);
					forward.setToX(80);
					forward.setToY(0);
					forward.play();
					counter++;
					R.add(f);
					R.add(Fox);
					Boat.remove(f);
					Boat.remove(Fox);
					end();
				} else if (F.getToX() == 250) {
					F.setDuration(Duration.millis(300));
					F.setNode(farmer);
					F.setToX(454);
					F.setToY(8);
					F.play();
					forward.setDuration(Duration.millis(300));
					forward.setNode(boat);
					forward.setToX(80);
					forward.setToY(0);
					forward.play();
					counter++;
					R.add(f);
					Boat.remove(f);
					end();
				} else {


					System.out.println("the farmer must be in the boat");
				}
			} else {
				if (F.getToX() == 288 && g.getToX() == 259) {
					g.setDuration(Duration.millis(300));
					g.setNode(goat);
					g.setToX(0);
					g.setToY(0);
					g.play();
					F.setDuration(Duration.millis(300));
					F.setNode(farmer);
					F.setToX(0);
					F.setToY(0);
					F.play();
					backward.setDuration(Duration.millis(300));
					backward.setNode(boat);
					backward.setToX(0);
					backward.setToY(0);
					backward.play();
					counter++;
					L.add(f);
					L.add(Goat);
					Boat.remove(f);
					Boat.remove(Goat);
					end();
				} else if (F.getToX() == 288 && p.getToX() == 290) {
					p.setDuration(Duration.millis(300));
					p.setNode(plant);
					p.setToX(0);
					p.setToY(0);
					p.play();
					F.setDuration(Duration.millis(300));
					F.setNode(farmer);
					F.setToX(0);
					F.setToY(0);
					F.play();
					backward.setDuration(Duration.millis(300));
					backward.setNode(boat);
					backward.setToX(0);
					backward.setToY(0);
					backward.play();
					counter++;
					L.add(f);
					L.add(Plant);
					Boat.remove(f);
					Boat.remove(Plant);
					end();
				} else if (F.getToX() == 288 && fo.getToX() == 328) {
					fo.setDuration(Duration.millis(300));
					fo.setNode(fox);
					fo.setToX(0);
					fo.setToY(0);
					fo.play();
					F.setDuration(Duration.millis(300));
					F.setNode(farmer);
					F.setToX(0);
					F.setToY(0);
					F.play();
					backward.setDuration(Duration.millis(300));
					backward.setNode(boat);
					backward.setToX(0);
					backward.setToY(0);
					backward.play();
					counter++;
					L.add(f);
					L.add(Fox);
					Boat.remove(f);
					Boat.remove(Fox);
					end();
				} else if (F.getToX() == 288) {
					F.setDuration(Duration.millis(300));
					F.setNode(farmer);
					F.setToX(0);
					F.setToY(0);
					F.play();
					backward.setDuration(Duration.millis(300));
					backward.setNode(boat);
					backward.setToX(0);
					backward.setToY(0);
					backward.play();
					counter++;
					L.add(f);
					Boat.remove(f);
				//	System.out.println(""+L.size());
					end();
				} else {


					System.out.println("The farmer must be on the boat");
				}
			}

		}
		else
		{
			if((L.contains(Goat)&&L.contains(Plant))||(R.contains(Goat)&&R.contains(Plant)))
			{if(L.contains(f)||R.contains(f))
				al.Display("Error","Farmer Must Be On Boat To Sail");
			else
             al.Display("Error","Jerry Will Eat Cheese");
			}
			else if((L.contains(Goat)&&L.contains(Fox))||(R.contains(Goat)&&R.contains(Fox)))
			{if(L.contains(f)||R.contains(f))
				al.Display("Error","Farmer Must Be On Boat To Sail");
			else
				al.Display("Error","Tom Will Eat Jerry");

			}
			else 
			{
				al.Display("Error","Farmer Must Be On Boat To Sail");
			}
		}

	}


	public boolean isBoatOnTheLeftBank() {
		if(counter%2==0)
			return true;
		else
			return false;
	}

	public void movefarmer(MouseEvent event) {


		//Boat.add(L.remove(0));
/*for (int i = 0; i < L.size(); i++) {
	ImageView im =new ImageView();
	im.setImage(L.get(i).getImages()[0]);*/
if(flag==0)
{
	Initialize2();
	flag++;

}

		if(isBoatOnTheLeftBank())
		{
			if(F.getToX()==250)
			{
				F.setNode(farmer);
				F.setToX(0);
				F.setToY(0);
				F.play();
				Boat.remove(f);
				L.add(f);
			}


			else
			{
				F.setDuration(Duration.millis(300));
				F.setNode(farmer);

				F.setToX(250);
				F.setToY(54);
				F.play();

				Boat.add(f);
				L.remove(f);
				//L=st.getInitialCrossers();
		/*		for (int i=0;i<L.size();i++)
					System.out.println(" "+L.get(i).geteatingrank());

				System.out.println(""+L.size());

*/
			}}
		else

		{   if(F.getToX()==454) {
			F.setDuration(Duration.millis(300));
			F.setNode(farmer);
			F.setToX(458-170);
			F.setToY(184-139);
			F.play();
			R.remove(f);
			Boat.add(f);
		}
		else
		{
			F.setDuration(Duration.millis(300));
			F.setNode(farmer);
			F.setToX(454);
			F.setToY(8);
			F.play();
			Boat.remove(f);
			R.add(f);

		}
		}



	}


	public void movefox(MouseEvent event) {
		if(flag==0)
		{
			Initialize2();
			flag++;

		}
		if (isBoatOnTheLeftBank())

		{
			if (g.getToX() == 126 || p.getToX() == 168) {
				/*x.setNode(fox);
				x.setToX(0);
				x.setToY(0);
				x.play();*/
			}

			else if (fo.getToX() == 206) {

				fo.setNode(fox);
				fo.setToX(0);
				fo.setToY(0);
				fo.play();
				Boat.remove(Fox);
				L.add(Fox);

			}


			else  {

				fo.setDuration(Duration.millis(300));
				fo.setNode(fox);
				fo.setToX(206);
				fo.setToY(-11);
				fo.play();
				L.remove(Fox);
				Boat.add(Fox);


			}}
		else
		{  if(g.getToX() == 259 || p.getToX() == 290)
		{
			/*x5.setNode(fox);
			x5.setToX(420);
			x5.setToY(5);
			x5.play();*/

		}
		else if(fo.getToX()==420)
		{
			fo.setDuration(Duration.millis(300));
			fo.setNode(fox);
			fo.setToX(458-130);
			fo.setToY(-15);
			fo.play();

			R.remove(Fox);
			Boat.add(Fox);
		}

		else if(fo.getToX()==328)
		{
			fo.setDuration(Duration.millis(300));
			fo.setNode(fox);
			fo.setToX(420);
			fo.setToY(5);
			fo.play();
			Boat.remove(Fox);
			R.add(Fox);
		}


		}

	}


	public void movegoat(MouseEvent event) {
		if(flag==0)
		{
			Initialize2();
			flag++;

		}
		if(isBoatOnTheLeftBank())
		{
			if(p.getToX() == 168 || fo.getToX() ==206 )
			{
				/*x2.setNode(goat);
				x2.setToX(0);
				x2.setToY(0);
				x2.play();*/
			}

			else if(g.getToX()==126)
			{
				g.setNode(goat);
				g.setToX(0);
				g.setToY(0);
				g.play();
				Boat.remove(Goat);
				L.add(Goat);

			}
			else if (g.getToX()!=309) {

				g.setDuration(Duration.millis(300));
				g.setNode(goat);
				g.setToX(226-100);
				g.setToY(219-126);
				g.play();

				L.remove(Goat);
				Boat.add(Goat);

			}
		}
		else {
			if(p.getToX() == 290 || fo.getToX() ==328)
			{
				/*x6.setNode(goat);
				x6.setToX(309);
				x6.setToY(0);
				x6.play();*/

			}
			else if(g.getToX()==309)
			{
				g.setNode(goat);
				g.setToX(309-50);
				g.setToY(90);
				g.play();

				R.remove(Goat);
				Boat.add(Goat);


			}

			else if(g.getToX()==259)
			{
				g.setNode(goat);
				g.setToX(309);
				g.setToY(0);
				g.play();

				Boat.remove(Goat);
				R.add(Goat);
			}

		}

	}
	public void moveplant(MouseEvent event) {
		if(flag==0)
		{
			Initialize2();
			flag++;

		}
		if(isBoatOnTheLeftBank())
		{
			if(g.getToX() == 126 || fo.getToX() ==206 )
			{
			    /*x3.setNode(plant);
				x3.setToX(0);
				x3.setToY(0);
				x3.play();*/
			}

			else if(p.getToX()==226-58)
			{
				p.setNode(plant);
				p.setToX(0);
				p.setToY(0);
				p.play();
				Boat.remove(Plant);
				L.add(Plant);

			}
			else if(p.getToX()!=417)
			{
				p.setDuration(Duration.millis(300));
				p.setNode(plant);
				p.setToX(226-58);
				p.setToY(219-302);
				p.play();
				L.remove(Plant);
				Boat.add(Plant);

			}
		}
		else
		{ if(g.getToX() == 259 || fo.getToX() ==328)
		{
			/*x3.setNode(plant);
			x3.setToX(417);
			x3.setToY(13);
			x3.play();*/

		}
		else if(p.getToX()==417)
		{ p.setNode(plant);
			p.setToX(290);
			p.setToY(-75);
			p.play();
			R.remove(Plant);
			Boat.add(Plant);
		}


		else if(p.getToX()==290)
		{ p.setNode(plant);
			p.setToX(417);
			p.setToY(13);
			p.play();
			Boat.remove(Plant);
			R.add(Plant);

		}
		}

	}


	public void newGame(ICrosserStrategy gameStrategy) {

	}


	public void resetGame() {

	}

	@Override
	public String getInstructions() {

		return null;
	}
public void getinst(){
	al.Display("Instruction",st.getInstructions());
}
@Override
	public List <ICrosser> getCrossersOnLeftBank() {
		return null;

	}

	@Override
	public List<ICrosser> getCrossersOnRightBank() {

		return null;
	}

	public int getNumberOfSails() {

		return counter;
	}

	@Override
	public boolean canMove(List<ICrosser> crossers, boolean fromLeftToRightBank) {

		return false;
	}

	@Override
	public void doMove(List<ICrosser> crossers, boolean fromLeftToRightBank) {

	}

	@Override
	public boolean canUndo() {
		return false;
	}

	@Override
	public boolean canRedo() {
		return false;
	}

	@Override
	public void undo() {

	}

	@Override
	public void redo() {

	}

	
	public void saveGame() {
		try {
            DocumentBuilderFactory dFact = DocumentBuilderFactory.newInstance();
            DocumentBuilder build = dFact.newDocumentBuilder();
            Document doc = build.newDocument();

        Element root = doc.createElement("score");
        doc.appendChild(root);
      //  Attr attrType = doc.createAttribute("type");
     //   Element leftarraElement = doc.createElement("leftarray");
     //   root.appendChild(leftarraElement);
     //   Element right = doc.createElement("rightarray");
      //  root.appendChild(right);
      //  Element boatcrosser = doc.createElement("boatriders");
     //   root.appendChild(boatcrosser);
      //  Element boat = doc.createElement("boatposition");
     //   root.appendChild(boat);
      //  Element Story= doc.createElement("story");
       // root.appendChild(Story);
     //   Element Score= doc.createElement("score");
       // root.appendChild(Score);
        String x=Integer.toString(counter);
        root.appendChild(doc.createTextNode(x));
        
        
      /*  Element position = doc.createElement("postion");
        
            if (isBoatOnTheLeftBank()==true) {
                position.appendChild(doc.createTextNode("left"));
            }
            else{
                position.appendChild(doc.createTextNode("right"));}
            root.appendChild(position);
            if(st instanceof  Story1){
                 Story.appendChild(doc.createTextNode("Story1"));
            }
            else  Story.appendChild(doc.createTextNode("Story2"));
            
        
        for (int i = 0; i < L.size(); i++) {
            Element cname = doc.createElement("Crosser");
             if (L.get(i) instanceof Carnivore) {
                    cname.appendChild(doc.createTextNode("Carnivore"));
                } else if (L.get(i) instanceof Herbivore) {
                    
                    cname.appendChild(doc.createTextNode("Herbivore"));
                } else if (L.get(i) instanceof Plant) {
                    
                     cname.appendChild(doc.createTextNode("Plant"));
                } else if (L.get(i) instanceof Farmer) {
                    
                    cname.appendChild(doc.createTextNode("Farmer"));
                } else if (L.get(i) instanceof Farmer3) {
                   
                    cname.appendChild(doc.createTextNode("Farmer3"));
                } else if (L.get(i) instanceof Farmer2) {
                    cname.appendChild(doc.createTextNode("Farmer2"));
                } else if (L.get(i) instanceof Farmer4) {
                    cname.appendChild(doc.createTextNode("Farmer4"));
                } else if (L.get(i) instanceof Farmer5) {
                    cname.appendChild(doc.createTextNode("Farmer5"));
                }
            
             leftarraElement.appendChild(cname);
        }
        for (int i = 0; i < R.size(); i++) {
            Element cname = doc.createElement("Crosser");
             if (R.get(i) instanceof Carnivore) {
                    //cname.setValue("Carnivore");
                    cname.appendChild(doc.createTextNode("Carnivore"));
                } else if (R.get(i) instanceof Herbivore) {
                    //attrType.setValue("Harbivore");
                    cname.appendChild(doc.createTextNode("Herbivore"));
                } else if (R.get(i) instanceof Plant) {
                    //attrType.setValue("Plant");
                     cname.appendChild(doc.createTextNode("Plant"));
                } else if (R.get(i) instanceof Farmer) {
                    //attrType.setValue("Farmer");
                    cname.appendChild(doc.createTextNode("Farmer"));
                } else if (R.get(i) instanceof Farmer3) {
                   // attrType.setValue("Farmer3");
                    cname.appendChild(doc.createTextNode("Farmer3"));
                } else if (R.get(i) instanceof Farmer2) {
                    cname.appendChild(doc.createTextNode("Farmer2"));
                } else if (R.get(i) instanceof Farmer4) {
                    cname.appendChild(doc.createTextNode("Farmer4"));
                } else if (R.get(i) instanceof Farmer5) {
                    cname.appendChild(doc.createTextNode("Farmer5"));
                }
            
             right.appendChild(cname);
        }
        for (int i = 0; i < Boat.size(); i++) {
            Element cname = doc.createElement("Crosser");
             if (Boat.get(i) instanceof Carnivore) {
                    //cname.setValue("Carnivore");
                    cname.appendChild(doc.createTextNode("Carnivore"));
                } else if (Boat.get(i) instanceof Herbivore) {
                    //attrType.setValue("Harbivore");
                    cname.appendChild(doc.createTextNode("Herbivore"));
                } else if (Boat.get(i) instanceof Plant) {
                    //attrType.setValue("Plant");
                     cname.appendChild(doc.createTextNode("Plant"));
                } else if (Boat.get(i) instanceof Farmer) {
                    //attrType.setValue("Farmer");
                    cname.appendChild(doc.createTextNode("Farmer"));
                } else if (Boat.get(i) instanceof Farmer3) {
                   // attrType.setValue("Farmer3");
                    cname.appendChild(doc.createTextNode("Farmer3"));
                } else if (Boat.get(i) instanceof Farmer2) {
                    cname.appendChild(doc.createTextNode("Farmer2"));
                } else if (Boat.get(i) instanceof Farmer4) {
                    cname.appendChild(doc.createTextNode("Farmer4"));
                } else if (Boat.get(i) instanceof Farmer5) {
                    cname.appendChild(doc.createTextNode("Farmer5"));
                }
            
             boatcrosser.appendChild(cname);
        }*/
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("story1.xml"));
            transformer.transform(source, result);
            // Output to console for testing
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
	   }
	
	
	
	@Override
	public void loadGame() {
		/*while(L.size()>0)
		{
			L.remove(L.size()-1);
		}
		while(R.size()>0)
		{
			R.remove(R.size()-1);
		}
		while(Boat.size()>0)
		{
			Boat.remove(Boat.size()-1);
		}*/
		
		
		
		
			    try {

				SAXParserFactory factory = SAXParserFactory.newInstance();
				javax.xml.parsers.SAXParser saxParser = factory.newSAXParser();

				DefaultHandler handler = new DefaultHandler() {

			    /* 	boolean Larray = false;
				    boolean Rarray = false;
			     	boolean boat = false;
			     	boolean bsalary = false;
			        boolean story = false;
			        boolean crosser=false;
			        boolean rlist=false;
			        boolean blist=false;
			        boolean boatposition=false;
			        boolean score=false;*/
			        
				public void startElement(String uri, String localName,String qName, 
			                Attributes attributes) throws SAXException {

					//System.out.println("Start Element :" + qName);
			                
			              /*   if (qName.equalsIgnoreCase("rightarray")) {
					Rarray = true;
					}
			                if (qName.equalsIgnoreCase("leftarray")) {
						Larray = true;
					}
			                if (qName.equalsIgnoreCase("boat")) {
								boat = true;
							}
			                if (qName.equalsIgnoreCase("boatriders")) {
						rlist = true;
					}
					
			                if (qName.equalsIgnoreCase("Story")) {
						story = true;
					}
			                if (qName.equalsIgnoreCase("crosser")) {
						crosser = true;
					}
			                 if (qName.equalsIgnoreCase("score")) {
						score = true;
					}
					

					//if (qName.equalsIgnoreCase("NICKNAME")) {
					//	bnname = true;
					//}

					if (qName.equalsIgnoreCase("SALARY")) {
						bsalary = true;
					}

				*/}

				public void endElement(String uri, String localName,
					String qName) throws SAXException {

					//System.out.println("End Element :" + qName);

				}

				public void characters(char ch[], int start, int length) throws SAXException {

			                String left=null;
			                
			                String x=null;
			                
			              			              
			                left=new String(ch, start , length );
			            	 /* if (Larray) {
			                //	x=new String(ch,start,length);
								 
								 
							
System.out.println("left= "+left);
							
								if(left.equals("Farmer"))
									L.add(f);
								else	 if(left.equals("Carnivore"))
									{L.add(Fox);
									 System.out.println("lol");
									}	else if(left.equals("Herbivore"))
										L.add(Goat);
									else if(left.equals("Plant"))
											L.add(Plant);
									else	System.out.println("left array contains : " + new String(ch, start, length));

								}
			            	  x=new String(ch, start, length); 
								System.out.println("x1= "+x);
								
			            	  if(Larray)
			            		  {
			            		  
			            		 if(left.equals("Farmer"))
										L.add(f);
									else	 if(left.equals("Carnivore"))
										{L.add(Fox);
										 System.out.println("lol");
										}	else if(left.equals("Herbivore"))
											L.add(Goat);
										else if(left.equals("Plant"))
												L.add(Plant);
										else	System.out.println("left array contains : " + new String(ch, start, length));
			               
			            		  
			            		  
			            		  
			            		  
			            		  }	
			            	  x=new String(ch,start,length);
			            			  System.out.println(" x2="+x);
			            			  
			            	  
			            	  
			            	  
			            	  
								Larray=false;
							
			if (Rarray) {
				
			                        left=new String(ch, start, length);
			                        System.out.println("heyy  "+new String(ch, start, length));
			                        
						System.out.println("right array contains  : " + new String(ch, start, length));
						//System.out.println(""+left);
					//	System.out.println("Start Element :" + qName);
						if(left.equals("Farmer"))
						{
							R.add(f);
						}
						 if(left.equals("Carnivore"))
							R.add(Fox);
						 if(left.equals("Herbivore"))
								R.add(Goat);
							if(left.equals("Plant"))
									R.add(Plant);
						Rarray = false;
						
					}
			                
			                if (rlist) {
			                        left=new String(ch, start, length);
						System.out.println("boat contains : " + new String(ch, start, length));
						//System.out.println("LEFT IS : " + left);
					//	System.out.println("Start Element :" + qName);
						if(left.equals("Farmer"))
							Boat.add(f);
						 if(left.equals("Carnivore"))
							Boat.add(Fox);
						 if(left.equals("Herbivore"))
								Boat.add(Goat);
							if(left.equals("Plant"))
									Boat.add(Plant);
						
						
						
						rlist = false;
					}


					

					if (story) {
						//System.out.println("Nick Name : " + new String(ch, start, length));
						story = false;
					}
					*/

				//	if (score) {
                        left=new String(ch, start, length);

						//System.out.println("Salary : " + new String(ch, start, length));
						counter=Integer.parseInt(left);
						System.out.println(counter);
						
								
						//score = false;
				//	}

				}

			     };

			       saxParser.parse("story1.xml", handler);
			 
			     } catch (Exception e) {
			       e.printStackTrace();
			     }
			
			    
			    
			    /*  if(Boat.contains(f))
			    {
			    	if(isBoatOnTheLeftBank())
			    	{
			    		   F.setNode(farmer);
					       F.setDuration(Duration.millis(0.5));
					       F.setToX(250);
					       F.setToY(54);
					       F.play();}
			    	
			 
			     	else      
			    	{       
			     		
			     		    F.setNode(farmer);
					        F.setDuration(Duration.millis(0.5));
							F.setToX(458-170);
							F.setToY(184-139);
					        F.play();
					        backward.setDuration(Duration.millis(0.5));
							backward.setNode(boat);
							backward.setToX(80);
							backward.setToY(0);
							backward.play();}}
			    
			    
			        if(Boat.contains(Goat))
      {
    	  if(isBoatOnTheLeftBank())
    	{
    	 	   g.setNode(goat);
		       g.setDuration(Duration.millis(0.5));
		       g.setToX(126);
		       g.setToY(90);
		       g.play();}
    	
 
     	else      
    	{       
     		
     		    g.setNode(goat);
		        g.setDuration(Duration.millis(0.5));
				g.setToX(259);
				g.setToY(90);
		        g.play();
		        backward.setDuration(Duration.millis(0.5));
				backward.setNode(boat);
				backward.setToX(80);
				backward.setToY(0);
				backward.play();}
    	  }
    
    
	   if(Boat.contains(Fox))
     {
   	  if(isBoatOnTheLeftBank())
   	{
   	 	   fo.setNode(fox);
		       fo.setDuration(Duration.millis(0.5));
		       fo.setToX(206);
		       fo.setToY(-11);
		       fo.play();}
   	

    	else      
   	{       
    		
    		    fo.setNode(fox);
		        fo.setDuration(Duration.millis(0.5));
				fo.setToX(328);
				fo.setToY(-15);
		        fo.play();
		        backward.setDuration(Duration.millis(0.5));
				backward.setNode(boat);
				backward.setToX(80);
				backward.setToY(0);
				backward.play();}}
   
   
			  
	if(Boat.contains(Plant))
    {
  	  if(isBoatOnTheLeftBank())
  	{
  	 	       p.setNode(plant);
		       p.setDuration(Duration.millis(0.5));
		       p.setToX(226-58);
			   p.setToY(219-302);
		       p.play();}
  	

   	else      
  	{       
   		
   		        p.setNode(plant);
		        p.setDuration(Duration.millis(0.5));
		        p.setToX(290);
				p.setToY(-75);
		        p.play();
		        backward.setDuration(Duration.millis(0.5));
				backward.setNode(boat);
				backward.setToX(80);
				backward.setToY(0);
				backward.play();}}*/
  
  }
			    

	
	@Override
	public List<List<ICrosser>> solveGame() {
		return null;
	}

}