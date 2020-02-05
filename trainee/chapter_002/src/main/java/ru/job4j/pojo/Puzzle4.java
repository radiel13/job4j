package ru.job4j.pojo;

public class Puzzle4 {
    public static void main(String[] args) {
        Puzzle4b[] obs = new Puzzle4b[6];
        int y = 1;
        int x = 0;
        int result = 0;

        while (x < 6) {
            obs[x]=new Puzzle4b();//
            obs[x].ivar = y;//
            y *= 10;
            x++;
        }
        x = 6;
        while (x > 0) {
            x--;
            result = result +obs[x].doStuff(x);//
        }
        System.out.println("Результат" + result);
    }
}

class Puzzle4b {
    int ivar;

    public int doStuff(int factor) {
        if (ivar > 100) {
            return ivar*factor;//
        } else {
            return ivar*(5-factor); //
        }
    }
}
//Результат 543345
//ivar=x;
//obs.ivar=x;
//obs[x].ivar=x;


//Puzzle4[]obs=new Puzzle4[6];

//Puzzle4b[]obs=new Puzzle4[6];

//doStuff(x);
 //                   obs.doStuff{x};
  //                  obs[x].doStuff(factor);


 //                   ivar

//ivar+factor;


    //                ;

//Puzzle4

//Puzzie4b()

//obs[x]=new Puzzle4b(x),
// obs[]=new Puzzle4b();
//
//obs=new Puzzle4b();^