package test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Table_Hash {

    static Frame TB= new Frame();

    public Table_Hash ( Frame frame, boolean modal )
    {
        Label Us =new Label  ("                          ****TABBLA HASH****                       ");
        Label FI =new Label  (" LLAVES            Funcion Hash        INDICE         REGISTROS     ");
        Label ECS=new Label  (" [manuel,45]             =1                         [A] ________ [manuel,45]");
        Label Se =new Label  (" [jose,70]                 =4                         [B] ________ [Melissa,24]");
        Label Cur=new Label  (" [Junior,60]              =5                         [C] ________ [Luis,36]");
        Label Prg=new Label  (" [Melissa,24]            =2                         [D] ________ [jose,70]");
        Label Id =new Label  (" [Luis,36]                 =3                         [E] ________ [Junior,60]");


        Us.setFont(new Font("SansSerif",Font.PLAIN,23));
        FI.setFont(new Font("SansSerif",Font.PLAIN,16));
        ECS.setFont(new Font("SansSerif",Font.PLAIN,15));
        Se.setFont(new Font("SansSerif",Font.PLAIN,15));
        Cur.setFont(new Font("SansSerif",Font.PLAIN,15));
        Prg.setFont(new Font("SansSerif",Font.PLAIN,15));
        Id.setFont(new Font("SansSerif",Font.PLAIN,15));

        Us.setBounds (50,50,500,30);
        FI.setBounds (50,80,500,30);
        ECS.setBounds(50,110,500,30);
        Se.setBounds (50,140,500,30);
        Cur.setBounds (50,170,500,30);
        Prg.setBounds(50,200,500,30);
        Id.setBounds (50,230,500,30);

        Us.setVisible(true);
        FI.setVisible(true);
        ECS.setVisible(true);
        Se.setVisible(true);
        Cur.setVisible(true);
        Prg.setVisible(true);
        Id.setVisible(true);

        TB.setTitle("Tablas Hash");
        TB.setLayout(null);
        TB.add(Us);
        TB.add(FI);
        TB.add(ECS);
        TB.add(Se);
        TB.add(Cur);
        TB.add(Prg);
        TB.add(Id);
        TB.pack();
        TB.setSize(600,300);
        TB.setResizable(false);
        TB.addWindowListener( new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                TB.dispose();
                TB.setVisible(false);
            }});

    }
  //  registro par { llave, valor }
    //var vector de pares casilla[0..numcasillas-1]

  //  function buscacasilla(llave) {
    //    i := hash(llave) módulo de numcasillas
      //  loop {
        //    if casilla[i] esta libre or casilla[i].llave = llave
          //  return i
       //     i := (i + 1) módulo de numcasillas
      //  }
    //}

   // function busqueda(llave)
    //i := buscacasilla(llave)
     //if casilla[i] está ocupada   // llave está en la tabla
      //   return casilla[i].valor
    // else                     // llave no está en la tabla
      //       return no encontrada

    //function asignar(llave, valor) {
      //  i := buscacasilla(llave)
        //if casilla[i] está ocupada
        //casilla[i].valor := valor
     //else {
       //     if tabla casi llena {
         //       hacer tabla más grande (nota 1)
           //     i := buscacasilla(llave)
            //}
            //casilla[i].llave := llave
            //casilla[i].valor := valor
        //}
    //}


}
