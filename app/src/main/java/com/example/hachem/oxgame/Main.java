package com.example.hachem.oxgame;


        import android.app.Activity;
        import android.graphics.Color;

        import android.os.Bundle;
        import android.util.LayoutDirection;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class Main extends Activity {

    public int joueurCourant=1;
    public Button b1;
    public Button b2;
    public Button b3;
    public Button b4;
    public Button b5;
    public Button b6;
    public Button b7;
    public Button b8;
    public Button b9;
    public Button rejouer;
    public TextView j1;
    public TextView j2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        rejouer=(Button) findViewById(R.id.button10);
        j1=(TextView) findViewById(R.id.j1);
        j2=(TextView) findViewById(R.id.j2);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {cliquer( b1) ;verif();}});
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {cliquer( b2) ;verif();}});
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {cliquer( b3) ;verif();}});
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {cliquer( b4) ;verif();}});
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {cliquer( b5) ;verif();}});
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {cliquer( b6) ;verif();}});
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {cliquer( b7) ;verif();}});
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {cliquer( b8) ;verif();}});
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {cliquer(b9) ;verif();}});
        rejouer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                activerTout();
                viderBouton();
                colorer(Color.WHITE);
            }
        });

    }

    public void cliquer(Button b)
    {
        if(joueurCourant==1)
        {

            b.setText("X");
            joueurCourant=2;
        }
        else
        {

            b.setText("O");
            joueurCourant=1;
        }
        b.setEnabled(false);

    }

    public void activerTout()
    {
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
    }
    public void desactiverTout()
    {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
    }
    public void viderBouton()
    {


        b1.setText(" ");
        b2.setText(" ");
        b3.setText(" ");
        b4.setText(" ");
        b5.setText(" ");
        b6.setText(" ");
        b7.setText(" ");
        b8.setText(" ");
        b9.setText(" ");


    }
    public void colorer(int c )
    {
        b1.setBackgroundColor(c);
        b2.setBackgroundColor(c);
        b3.setBackgroundColor(c);
        b4.setBackgroundColor(c);
        b5.setBackgroundColor(c);
        b6.setBackgroundColor(c);
        b7.setBackgroundColor(c);
        b8.setBackgroundColor(c);
        b9.setBackgroundColor(c);
    }
    public void selectionner(Button b11,Button b22,Button b33,int c )
    {
        b11.setBackgroundColor(c);
        b22.setBackgroundColor(c);
        b33.setBackgroundColor(c);

    }
    public void verif()
    {
        char c1=b1.getText().toString().charAt(0);
        char c2=b2.getText().toString().charAt(0);
        char c3=b3.getText().toString().charAt(0);
        char c4=b4.getText().toString().charAt(0);
        char c5=b5.getText().toString().charAt(0);
        char c6=b6.getText().toString().charAt(0);
        char c7=b7.getText().toString().charAt(0);
        char c8=b8.getText().toString().charAt(0);
        char c9=b9.getText().toString().charAt(0);
        if(c1==c2&&c2==c3&&c1=='X')
        {
            selectionner(b1, b2, b3, Color.rgb(246, 140, 20));desactiverTout();
        }
        else if(c4==c5&&c5==c6&&c6=='X')
        {
            selectionner(b4,b5,b6,Color.rgb(246,140,20));desactiverTout();
        }
        else if(c7==c8&&c8==c9&&c9=='X')
        {
            selectionner(b7,b8,b9,Color.rgb(246,140,20));desactiverTout();
        }
        else if(c1==c4&&c4==c7&&c7=='X')
        {
            selectionner(b1,b4,b7,Color.rgb(246,140,20));desactiverTout();
        }
        else if(c2==c5&&c5==c8&&c8=='X')
        {
            selectionner(b2,b5,b8,Color.rgb(246,140,20));desactiverTout();
        }
        else if(c3==c6&&c6==c9&&c9=='X')
        {
            selectionner(b3,b6,b9,Color.rgb(246,140,20));desactiverTout();
        }
        else if(c1==c5&&c5==c9&&c9=='X')
        {
            selectionner(b1,b5,b9,Color.rgb(246,140,20));desactiverTout();
        }
        else if(c3==c5&&c5==c7&&c7=='X')

        {
            selectionner(b3,b5,b7,Color.rgb(246,140,20));desactiverTout();
        }
//********************
        else if(c1==c2&&c2==c3&&c1=='O')
        {
            selectionner(b1, b2, b3, Color.rgb(253, 221, 126));desactiverTout();
        }
        else if(c4==c5&&c5==c6&&c6=='O')
        {
            selectionner(b4,b5,b6,Color.rgb(253, 221, 126));desactiverTout();
        }
        else if(c7==c8&&c8==c9&&c9=='O')
        {
            selectionner(b7,b8,b9,Color.rgb(253, 221, 126));desactiverTout();
        }
        else if(c1==c4&&c4==c7&&c7=='O')
        {
            selectionner(b1,b4,b7,Color.rgb(253, 221, 126));desactiverTout();
        }
        else if(c2==c5&&c5==c8&&c8=='O')
        {
            selectionner(b2,b5,b8,Color.rgb(253, 221, 126));desactiverTout();
        }
        else if(c3==c6&&c6==c9&&c9=='O')
        {
            selectionner(b3,b6,b9,Color.rgb(253, 221, 126));desactiverTout();
        }
        else if(c1==c5&&c5==c9&&c9=='O')
        {
            selectionner(b1,b5,b9,Color.rgb(253, 221, 126));desactiverTout();
        }
        else if(c3==c5&&c5==c7&&c7=='O')

        {
            selectionner(b3,b5,b7,Color.rgb(253, 221, 126));desactiverTout();
        }

    }
}
