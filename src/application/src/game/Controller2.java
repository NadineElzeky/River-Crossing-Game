package game;



import java.util.ArrayList;
import java.util.List;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller2 {
    public ImageView mickey, zeze,boat,pluto,batot,meme;
    private int flag=0;
    AlertBox al=new AlertBox();
    List<ICrosser> L=new ArrayList<>();


    List<ICrosser> R=new ArrayList<>();


    List<ICrosser> Boat=new ArrayList<>();
public Button move;

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

    Goat G=new Goat();
    Farmer2 f2=new Farmer2();
    Farmer3 f3=new Farmer3();
    Farmer4 f4=new Farmer4();
    Farmer5 f5=new Farmer5();
    Story2 st2=new Story2();
public void end(){
    if(L.size()==0)
    {
        al.Display2("Wiiner","Chicken Fucken");
        Stage stage = (Stage) move.getScene().getWindow();
        stage.close();

    }
    }
    public void getinst2(){

    al.Display("Instruction",st2.getInstructions());

}
    public void initialize2(){
if(flag==0) {
    L.add(G);
    L.add(f2);
    L.add(f3);
    L.add(f4);
    L.add(f5);
    flag++;
}
    }

    public void moveboat(ActionEvent event) {
        if (st2.isValid(R, L, Boat)) {
            if (isBoatOnTheLeftBank()) {
                if ((g.getToX() == 233 - 104 || g.getToX() == 277 - 104) && (F.getToX() == 227 - 4 || F.getToX() == 272 - 4)) {
                    g.setDuration(Duration.millis(300));
                    g.setNode(mickey);
                    g.setToX(432 - 104);
                    g.setToY(121 - 126);
                    g.play();
                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(488 - 4);
                    F.setToY(135 - 131);
                    F.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove(f4);
                    Boat.remove(f5);
                    R.add(f4);
                    R.add(f5);
                    end();
                } else if ((g.getToX() == 233 - 104 || g.getToX() == 277 - 104) && (p.getToX() == 233 - 58 || p.getToX() == 281 - 58)) {
                    g.setDuration(Duration.millis(300));
                    g.setNode(mickey);
                    g.setToX(432 - 104);
                    g.setToY(121 - 126);
                    g.play();
                    p.setDuration(Duration.millis(300));
                    p.setNode(pluto);
                    p.setToX(463 - 58);
                    p.setToY(296 - 302);
                    p.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove((f4));
                    Boat.remove(G);
                    R.add(f4);
                    R.add(G);
                end();
                } else if ((g.getToX() == 233 - 104 || g.getToX() == 277 - 104) && (fo2.getToX() == 221 - 77 || fo2.getToX() == 263 - 77)) {
                    g.setDuration(Duration.millis(300));
                    g.setNode(mickey);
                    g.setToX(432 - 104);
                    g.setToY(121 - 126);
                    g.play();
                    fo2.setDuration(Duration.millis(300));
                    fo2.setNode(meme);
                    fo2.setToX(430 - 77);
                    fo2.setToY(184 - 174);
                    fo2.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove((f4));
                    Boat.remove(f2);
                    R.add(f4);
                    R.add(f2);
                    end();
                } else if ((g.getToX() == 233 - 104 || g.getToX() == 277 - 104) && (fo.getToX() == 235 - 14 || fo.getToX() == 273 - 14)) {
                    g.setDuration(Duration.millis(300));
                    g.setNode(mickey);
                    g.setToX(432 - 104);
                    g.setToY(121 - 126);
                    g.play();
                    fo.setDuration(Duration.millis(300));
                    fo.setNode(zeze);
                    fo.setToX(515 - 14);
                    fo.setToY(217 - 218);
                    fo.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove((f4));
                    Boat.remove(f3);
                    R.add(f4);
                    R.add(f3);
                    end();
                } else if (g.getToX() == 233 - 104 || g.getToX() == 277 - 104) {
                    g.setDuration(Duration.millis(300));
                    g.setNode(mickey);
                    g.setToX(432 - 104);
                    g.setToY(121 - 126);
                    g.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove(f4);
                    R.add(f4);
                    end();
                } else if ((p.getToX() == 233 - 58 || p.getToX() == 281 - 58) && (fo.getToX() == 235 - 14 || fo.getToX() == 273 - 14)) {
                    p.setDuration(Duration.millis(300));
                    p.setNode(pluto);
                    p.setToX(463 - 58);
                    p.setToY(296 - 302);
                    p.play();
                    fo.setDuration(Duration.millis(300));
                    fo.setNode(zeze);
                    fo.setToX(515 - 14);
                    fo.setToY(217 - 218);
                    fo.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove(f3);
                    Boat.remove(G);
                    R.add(f3);
                    R.add(G);
                    end();
                } else if ((p.getToX() == 233 - 58 || p.getToX() == 281 - 58) && (fo2.getToX() == 221 - 77 || fo2.getToX() == 263 - 77)) {
                    p.setDuration(Duration.millis(300));
                    p.setNode(pluto);
                    p.setToX(463 - 58);
                    p.setToY(296 - 302);
                    p.play();
                    fo2.setDuration(Duration.millis(300));
                    fo2.setNode(meme);
                    fo2.setToX(430 - 77);
                    fo2.setToY(184 - 174);
                    fo2.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove(f2);
                    Boat.remove(G);
                    R.add(f2);
                    R.add(G);
                    end();
                } else if ((p.getToX() == 233 - 58 || p.getToX() == 281 - 58) && (F.getToX() == 227 - 4 || F.getToX() == 272 - 4)) {
                    p.setDuration(Duration.millis(300));
                    p.setNode(pluto);
                    p.setToX(463 - 58);
                    p.setToY(296 - 302);
                    p.play();
                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(488 - 4);
                    F.setToY(135 - 131);
                    F.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove(f5);
                    Boat.remove(G);
                    R.add(f5);
                    R.add(G);
                    end();
                } else if ((p.getToX() == 233 - 58 || p.getToX() == 281 - 58)) {
                    System.out.println("pluto can't sail boat");
                } else if ((fo2.getToX() == 221 - 77 || fo2.getToX() == 263 - 77) && (F.getToX() == 227 - 4 || F.getToX() == 272 - 4)) {
                    fo2.setDuration(Duration.millis(300));
                    fo2.setNode(meme);
                    fo2.setToX(430 - 77);
                    fo2.setToY(184 - 174);
                    fo2.play();
                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(488 - 4);
                    F.setToY(135 - 131);
                    F.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove(f2);
                    Boat.remove(f5);
                    R.add(f2);
                    R.add(f5);
                    end();
                } else if ((fo2.getToX() == 221 - 77 || fo2.getToX() == 263 - 77) && (fo.getToX() == 235 - 14 || fo.getToX() == 273 - 14)) {
                    fo2.setDuration(Duration.millis(300));
                    fo2.setNode(meme);
                    fo2.setToX(430 - 77);
                    fo2.setToY(184 - 174);
                    fo2.play();
                    F.setDuration(Duration.millis(300));
                    F.setNode(zeze);
                    F.setToX(515 - 14);
                    F.setToY(217 - 218);
                    F.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove(f2);
                    Boat.remove(f3);
                    R.add(f2);
                    R.add(f3);
                    end();
                } else if ((fo2.getToX() == 221 - 77 || fo2.getToX() == 263 - 77)) {
                    fo2.setDuration(Duration.millis(300));
                    fo2.setNode(meme);
                    fo2.setToX(430 - 77);
                    fo2.setToY(184 - 174);
                    fo2.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove(f2);
                    R.add(f2);
                    end();
                } else if ((F.getToX() == 227 - 4 || F.getToX() == 272 - 4) && (fo.getToX() == 235 - 14 || fo.getToX() == 273 - 14)) {
                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(488 - 4);
                    F.setToY(135 - 131);
                    F.play();
                    fo.setDuration(Duration.millis(300));
                    fo.setNode(zeze);
                    fo.setToX(515 - 14);
                    fo.setToY(217 - 218);
                    fo.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove(f3);
                    Boat.remove(f5);
                    R.add(f3);
                    R.add(f5);
                    end();
                } else if ((F.getToX() == 227 - 4 || F.getToX() == 272 - 4)) {
                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(488 - 4);
                    F.setToY(135 - 131);
                    F.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove(f5);
                    R.add(f5);
                    end();
                } else if ((fo.getToX() == 235 - 14 || fo.getToX() == 273 - 14)) {
                    fo.setDuration(Duration.millis(300));
                    fo.setNode(zeze);
                    fo.setToX(515 - 14);
                    fo.setToY(217 - 218);
                    fo.play();
                    forward.setDuration(Duration.millis(300));
                    forward.setNode(boat);
                    forward.setToX(80);
                    forward.setToY(0);
                    forward.play();
                    counter++;
                    Boat.remove(f3);
                    R.add(f3);
                    end();
                } else {
                    System.out.println("some one should sail the boat");
                }


            }


            ////////////////////////////////////////////////////////////////

            else {
                if ((g.getToX() == 316 - 104 || g.getToX() == 353 - 104) && (F.getToX() == 313 - 4 || F.getToX() == 346 - 4)) {
                    g.setDuration(Duration.millis(300));
                    g.setNode(mickey);
                    g.setToX(0);
                    g.setToY(0);
                    g.play();
                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(0);
                    F.setToY(0);
                    F.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(f4);
                    L.add(f4);
                    Boat.remove(f5);
                    L.add(f5);
                    end();
                } else if ((g.getToX() == 316 - 104 || g.getToX() == 353 - 104) && (p.getToX() == 316 - 58 || p.getToX() == 359 - 58)) {
                    g.setDuration(Duration.millis(300));
                    g.setNode(mickey);
                    g.setToX(0);
                    g.setToY(0);
                    g.play();
                    p.setDuration(Duration.millis(300));
                    p.setNode(pluto);
                    p.setToX(0);
                    p.setToY(0);
                    p.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(f4);
                    L.add(f4);
                    Boat.remove(G);
                    L.add(G);
                    end();
                } else if ((g.getToX() == 316 - 104 || g.getToX() == 353 - 104) && (fo2.getToX() == 301 - 77 || fo2.getToX() == 353 - 77)) {
                    g.setDuration(Duration.millis(300));
                    g.setNode(mickey);
                    g.setToX(0);
                    g.setToY(0);
                    g.play();
                    fo2.setDuration(Duration.millis(300));
                    fo2.setNode(meme);
                    fo2.setToX(0);
                    fo2.setToY(0);
                    fo2.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(f4);
                    L.add(f4);
                    Boat.remove(f2);
                    L.add(f2);
                    end();
                } else if ((g.getToX() == 316 - 104 || g.getToX() == 353 - 104) && (fo.getToX() == 315 - 14 || fo.getToX() == 353 - 14)) {
                    g.setDuration(Duration.millis(300));
                    g.setNode(mickey);
                    g.setToX(0);
                    g.setToY(0);
                    g.play();
                    fo.setDuration(Duration.millis(300));
                    fo.setNode(zeze);
                    fo.setToX(0);
                    fo.setToY(0);
                    fo.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(f4);
                    L.add(f4);
                    Boat.remove(f3);
                    L.add(f3);
                    end();
                } else if (g.getToX() == 316 - 104 || g.getToX() == 353 - 104) {
                    g.setDuration(Duration.millis(300));
                    g.setNode(mickey);
                    g.setToX(0);
                    g.setToY(0);
                    g.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(f4);
                    L.add(f4);
                    end();
                } else if ((p.getToX() == 316 - 58 || p.getToX() == 359 - 58) && (fo.getToX() == 315 - 14 || fo.getToX() == 353 - 14)) {
                    p.setDuration(Duration.millis(300));
                    p.setNode(pluto);
                    p.setToX(0);
                    p.setToY(0);
                    p.play();
                    fo.setDuration(Duration.millis(300));
                    fo.setNode(zeze);
                    fo.setToX(0);
                    fo.setToY(0);
                    fo.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(G);
                    L.add(G);
                    Boat.remove(f3);
                    L.add(f3);
                    end();
                } else if ((p.getToX() == 316 - 58 || p.getToX() == 359 - 58) && (fo2.getToX() == 301 - 77 || fo2.getToX() == 353 - 77)) {
                    p.setDuration(Duration.millis(300));
                    p.setNode(pluto);
                    p.setToX(0);
                    p.setToY(0);
                    p.play();
                    fo2.setDuration(Duration.millis(300));
                    fo2.setNode(meme);
                    fo2.setToX(0);
                    fo2.setToY(0);
                    fo2.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(G);
                    L.add(G);
                    Boat.remove(f2);
                    L.add(f2);
                    end();
                } else if ((p.getToX() == 316 - 58 || p.getToX() == 359 - 58) && (F.getToX() == 313 - 4 || F.getToX() == 346 - 4)) {
                    p.setDuration(Duration.millis(300));
                    p.setNode(pluto);
                    p.setToX(0);
                    p.setToY(0);
                    p.play();
                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(0);
                    F.setToY(0);
                    F.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(G);
                    L.add(G);
                    Boat.remove(f5);
                    L.add(f5);
                    end();
                } else if ((p.getToX() == 316 - 58 || p.getToX() == 359 - 58)) {
                    System.out.println("pluto can't sail boat");
                } else if ((fo2.getToX() == 301 - 77 || fo2.getToX() == 353 - 77) && (F.getToX() == 313 - 4 || F.getToX() == 346 - 4)) {
                    fo2.setDuration(Duration.millis(300));
                    fo2.setNode(meme);
                    fo2.setToX(0);
                    fo2.setToY(0);
                    fo2.play();
                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(0);
                    F.setToY(0);
                    F.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(f2);
                    L.add(f2);
                    Boat.remove(f5);
                    L.add(f5);
                    end();
                } else if ((fo2.getToX() == 301 - 77 || fo2.getToX() == 353 - 77) && (fo.getToX() == 315 - 14 || fo.getToX() == 353 - 14)) {
                    fo2.setDuration(Duration.millis(300));
                    fo2.setNode(meme);
                    fo2.setToX(0);
                    fo2.setToY(0);
                    fo2.play();
                    F.setDuration(Duration.millis(300));
                    F.setNode(zeze);
                    F.setToX(0);
                    F.setToY(0);
                    F.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(f2);
                    L.add(f2);
                    Boat.remove(f3);
                    L.add(f3);
                    end();
                } else if ((fo2.getToX() == 301 - 77 || fo2.getToX() == 353 - 77)) {
                    fo2.setDuration(Duration.millis(300));
                    fo2.setNode(meme);
                    fo2.setToX(0);
                    fo2.setToY(0);
                    fo2.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(f2);
                    L.add(f2);
                    end();
                } else if ((F.getToX() == 313 - 4 || F.getToX() == 346 - 4) && (fo.getToX() == 315 - 14 || fo.getToX() == 353 - 14)) {
                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(0);
                    F.setToY(0);
                    F.play();
                    fo.setDuration(Duration.millis(300));
                    fo.setNode(zeze);
                    fo.setToX(0);
                    fo.setToY(0);
                    fo.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(f3);
                    L.add(f3);
                    Boat.remove(f5);
                    L.add(f5);
                    end();
                } else if ((F.getToX() == 313 - 4 || F.getToX() == 346 - 4)) {
                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(0);
                    F.setToY(0);
                    F.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(f5);
                    L.add(f5);
                    end();
                } else if ((fo.getToX() == 315 - 14 || fo.getToX() == 353 - 14)) {
                    fo.setDuration(Duration.millis(300));
                    fo.setNode(zeze);
                    fo.setToX(0);
                    fo.setToY(0);
                    fo.play();
                    backward.setDuration(Duration.millis(300));
                    backward.setNode(boat);
                    backward.setToX(0);
                    backward.setToY(0);
                    backward.play();
                    counter++;
                    Boat.remove(f3);
                    L.add(f3);
                    end();
                } else {
                    System.out.println("some one should sail the boat");
                }

            }
        }
        else
        {
            if(Boat.contains(G)&&Boat.contains(f3))
            {
                al.Display("Error","Over Weighted");

            }
            else if (Boat.contains(G))
            {
                al.Display("Error","Pluto Can't Sail");
            }
            else if(Boat.size()==0)
            {

                al.Display("Error","No One On Boat");
            }
            else
            {
                al.Display("Error","Over Weighted");
            }

        }


    }

    public boolean isBoatOnTheLeftBank() {
        if(counter%2==0)
            return true;
        else
            return false;
    }

    public void movebatot(MouseEvent event) {
initialize2();
        if (isBoatOnTheLeftBank()) {
            if (F.getToX() == 227 - 4 || F.getToX() == 272 - 4) {
                F.setNode(batot);
                F.setToX(0);
                F.setToY(0);
                F.play();
                Boat.remove(f5);
                L.add(f5);
            } else if (p.getToX() != 281 - 58 && g.getToX() != 277 - 104 && fo.getToX() != 273 - 14 && fo2.getToX() != 263 - 77) {
                if (F.getToX() != 488 - 4) {

                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(272 - 4);
                    F.setToY(200 - 131);
                    F.play();

                    L.remove(f5);
                    Boat.add(f5);
                }

            } else if (p.getToX() != 233 - 58 && g.getToX() != 233 - 104 && fo.getToX() != 235 - 14 && fo2.getToX() != 221 - 77) {
                if (F.getToX() != 488 - 4) {

                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(227 - 4);
                    F.setToY(200 - 131);
                    F.play();

                    L.remove(f5);
                    Boat.add(f5);
                }

            }


        } else {

            if (F.getToX() == 313 - 4 || F.getToX() == 346 - 4) {
                F.setNode(batot);
                F.setToX(488 - 4);
                F.setToY(135 - 131);
                F.play();

                Boat.remove(f5);
                R.add(f5);

            } else if (p.getToX() != 316 - 58 && g.getToX() != 316 - 104 && fo.getToX() != 315 - 14 && fo2.getToX() != 301 - 77) {
                if (F.getToX() == 488 - 4) {
                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(313 - 4);
                    F.setToY(199 - 131);
                    F.play();

                    Boat.add(f5);
                    R.remove(f5);
                }

            } else if (p.getToX() != 359 - 58 && g.getToX() != 353 - 104 && fo.getToX() != 353 - 14 && fo2.getToX() != 353 - 77) {
                if (F.getToX() == 488 - 4) {
                    F.setDuration(Duration.millis(300));
                    F.setNode(batot);
                    F.setToX(346 - 4);
                    F.setToY(200 - 131);
                    F.play();

                    Boat.add(f5);
                    R.remove(f5);
                }

            }


        }

    }

    public void movezeze(MouseEvent event) {
initialize2();
        if(isBoatOnTheLeftBank())
        {
            if(fo.getToX()==235-14||fo.getToX()==273-14)
            {
                fo.setNode(zeze);
                fo.setToX(0);
                fo.setToY(0);
                fo.play();
                Boat.remove(f3);
                L.add(f3);

            }

            else if(p.getToX()!=281-58&&g.getToX()!=277-104&&F.getToX()!=272-4&&fo2.getToX()!=263-77)
            {
                if(fo.getToX()!=515-14) {
                    fo.setDuration(Duration.millis(300));
                    fo.setNode(zeze);
                    fo.setToX(273 - 14);
                    fo.setToY(199 - 218);
                    fo.play();

                    L.remove(f3);
                    Boat.add(f3);

                }                }

            else  if(p.getToX()!=233-58&&g.getToX()!=233-104&&F.getToX()!=227-4&&fo2.getToX()!=221-77)
                {
                    if(fo.getToX()!=515-14) {
                        fo.setDuration(Duration.millis(300));
                        fo.setNode(zeze);
                        fo.setToX(235-14);
                        fo.setToY(200-218);
                        fo.play();

                        L.remove(f3);
                        Boat.add(f3);

                    }

                }

        }

        else
        {
            if(fo.getToX()==315-14||fo.getToX()==353-14)
        {
            fo.setNode(zeze);
            fo.setToX(515-14);
            fo.setToY(217-218);
            fo.play();

            Boat.remove(f3);
            R.add(f3);


        }

        else if(p.getToX()!=316-58&&g.getToX()!=316-104&&F.getToX()!=313-4&&fo2.getToX()!=301-77)
            {
                if(fo.getToX()==515-14) {
                    fo.setDuration(Duration.millis(300));
                    fo.setNode(zeze);
                    fo.setToX(315 - 14);
                    fo.setToY(200 - 218);
                    fo.play();

                    Boat.add(f3);
                    R.remove(f3);

                }
                   }



        else    if(p.getToX()!=359-58&&g.getToX()!=353-104&&F.getToX()!=346-4&&fo2.getToX()!=353-77)
            {
                if(fo.getToX()==515-14) {
                    fo.setDuration(Duration.millis(300));
                    fo.setNode(zeze);
                    fo.setToX(353-14);
                    fo.setToY(199-218);
                    fo.play();

                    Boat.add(f3);
                    R.remove(f3);
                }
            }




        }
    }



    public void movemickey(MouseEvent event) {
initialize2();
        if(isBoatOnTheLeftBank())
        {

            if(g.getToX()==233-104||g.getToX()==277-104)
            {
                g.setNode(mickey);
                g.setToX(0);
                g.setToY(0);
                g.play();
                Boat.remove(f4);
                L.add(f4);


            }

            else if(p.getToX()!=281-58&&F.getToX()!=272-4&&fo.getToX()!=273-14&&fo2.getToX()!=263-77&&g.getToX()!=432-104)
            {
                g.setDuration(Duration.millis(300));
                g.setNode(mickey);
                g.setToX(277-104);
                g.setToY(219-126);
                g.play();

                L.remove(f4);
                Boat.add(f4);


            }

            else if(p.getToX()!=233-58&&F.getToX()!=227-4&&fo.getToX()!=235-14&&fo2.getToX()!=221-77&&g.getToX()!=432-104)

            {

                g.setDuration(Duration.millis(300));
                g.setNode(mickey);
                g.setToX(233-104);
                g.setToY(219-126);
                g.play();

                L.remove(f4);
                Boat.add(f4);

            }

        }




        else {
            if (g.getToX() == 316 - 104 || g.getToX() == 353 - 104) {
                g.setNode(mickey);
                g.setToX(432 - 104);
                g.setToY(121 - 126);
                g.play();

                Boat.remove(f4);
                R.add(f4);


            } else if (p.getToX() != 316 - 58 && F.getToX() != 313 - 4 && fo.getToX() != 315 - 14 && fo2.getToX() != 301 - 77) {
                if (g.getToX() == 432 - 104) {
                    g.setDuration(Duration.millis(300));
                    g.setNode(mickey);
                    g.setToX(316 - 104);
                    g.setToY(217 - 126);
                    g.play();


                    Boat.add(f4);
                    R.remove(f4);

                }
            } else if (p.getToX() != 359 - 58 && F.getToX() != 346 - 4 && fo.getToX() != 353 - 14 && fo2.getToX() != 353 - 77) {

                if (g.getToX() == 432 - 104) {
                    g.setDuration(Duration.millis(300));
                    g.setNode(mickey);
                    g.setToX(353 - 104);
                    g.setToY(216 - 126);
                    g.play();


                    Boat.add(f4);
                    R.remove(f4);

                }

            }
        }}

        public void movepluto(MouseEvent event) {
initialize2();
        if(isBoatOnTheLeftBank())
        {
            if(p.getToX()==281-58||p.getToX()==233-58)
            {
                p.setNode(pluto);
                p.setToX(0);
                p.setToY(0);
                p.play();
                Boat.remove(G);
                L.add(G);


            }

            else if(F.getToX()!=272-4&&g.getToX()!=277-104&&fo.getToX()!=273-14&&fo2.getToX()!=263-77) {

                if(p.getToX()!=463-58) {
                    p.setDuration(Duration.millis(300));
                    p.setNode(pluto);
                    p.setToX(281 - 58);
                    p.setToY(208 - 298);
                    p.play();

                    L.remove(G);
                    Boat.add(G);

                }

            }

             else   if(F.getToX()!=227-4&&g.getToX()!=233-104&&fo.getToX()!=235-14&&fo2.getToX()!=221-77)
                {
                     if(p.getToX()!=463-58) {
                        p.setDuration(Duration.millis(300));
                        p.setNode(pluto);
                        p.setToX(233-58);
                        p.setToY(214-298);
                        p.play();
                        L.remove(G);
                        Boat.add(G);


                    } }}

        else
        {
            if(p.getToX()==316-58||p.getToX()==359-58)
        {
            p.setNode(pluto);
            p.setToX(463-58);
            p.setToY(296-302);
            p.play();


            Boat.remove(G);
            R.add(G);
        }

        else if(F.getToX()!=313-4&&g.getToX()!=316-104&&fo.getToX()!=315-14&&fo2.getToX()!=301-77) {
                if(p.getToX()==463-58) {
                    p.setDuration(Duration.millis(300));
                    p.setNode(pluto);
                    p.setToX(316-58);
                    p.setToY(211-298);
                    p.play();

                    Boat.add(G);
                    R.remove(G);



                }}

          else  if(F.getToX()!=346-4&&g.getToX()!=353-104&&fo.getToX()!=353-14&&fo2.getToX()!=353-77)
            {
                if(p.getToX()==463-58) {
                    p.setDuration(Duration.millis(300));
                    p.setNode(pluto);
                    p.setToX(359-58);
                    p.setToY(211-298);
                    p.play();

                    Boat.add(G);
                    R.remove(G);
            }
            }
    }}

    public void movememe(MouseEvent event) {
initialize2();
        if(isBoatOnTheLeftBank())
        {
            if(fo2.getToX()==263-77||fo2.getToX()==221-77)
            {
                //System.out.println(" "+fo.getToX());
                fo2.setNode(meme);
                fo2.setToX(0);
                fo2.setToY(0);
                fo2.play();
                Boat.remove(f2);
                L.add(f2);


            }

            else if(F.getToX()!=272-4&&g.getToX()!=277-104&&fo.getToX()!=273-14&&p.getToX()!=281-58)
            {
                if(fo2.getToX()!=430-77) {
                    fo2.setDuration(Duration.millis(300));
                    fo2.setNode(meme);
                    fo2.setToX(263-77);
                    fo2.setToY(191-165);
                    fo2.play();

                    L.remove(f2);
                    Boat.add(f2);

                }

            }
            else   if(F.getToX()!=227-4&&g.getToX()!=233-104&&fo.getToX()!=235-14&&p.getToX()!=233-58)
                {
                    if(fo2.getToX()!=430-77) {
                        fo2.setDuration(Duration.millis(300));
                        fo2.setNode(meme);
                        fo2.setToX(221 - 77);
                        fo2.setToY(191 - 165);
                        fo2.play();

                        L.remove(f2);
                        Boat.add(f2);
                    }
                }
        }


        else {
            if (fo2.getToX() == 301 - 77 || fo2.getToX() == 353 - 77) {
                fo2.setNode(meme);
                fo2.setToX(430 - 77);
                fo2.setToY(184 - 174);
                fo2.play();

                Boat.remove(f2);
                R.add(f2);


            }
            else if(F.getToX() != 313 - 4 && g.getToX() != 316 - 104 && fo.getToX() != 315 - 14 && p.getToX() != 316 - 58) {
                if (fo2.getToX() == 430 - 77) {
                    fo2.setDuration(Duration.millis(300));
                    fo2.setNode(meme);
                    fo2.setToX(301 - 77);
                    fo2.setToY(200 - 165);
                    fo2.play();

                    Boat.add(f2);
                    R.remove(f2);
                }

            }
            else  if (F.getToX() != 353 - 4 && g.getToX() != 353 - 104 && fo.getToX() != 353 - 14 && p.getToX() != 359 - 58) {

                        if (fo2.getToX() == 430 - 77) {
                            fo2.setDuration(Duration.millis(300));
                            fo2.setNode(meme);
                            fo2.setToX(353 - 77);
                            fo2.setToY(199 - 165);
                            fo2.play();

                            Boat.add(f2);
                            R.remove(f2);
                        }

                    }

            }
        }







}