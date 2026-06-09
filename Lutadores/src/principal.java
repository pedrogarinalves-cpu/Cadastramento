public class principal {
    static void main(String[] args) {
        lutadores l [] = new lutadores[4];

        l[0]= new lutadores ("jp",
                "frança",
                31,
                1.76f,
                65.8f,
                11,
                2 ,
                1);

        l[1] = new lutadores("ana",
                "lituania",
                44,
                1.77f,
                56f,
                11,
                0,
                12);


        l[2] = new lutadores("pedro",
                "Brasil",
                34,
                1.88f,
                98.5f,
                22,
                2,
                4);

        l[3] = new lutadores("jp",
                "brasil",
                22,
                1.98f,
                90.7f,
                11,
                5,
                7);

        Luta UEC = new Luta();
        UEC.marcarluta(l[2], l[3]);
        UEC.lutar();
        
    }
}


