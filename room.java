public class room {
    public static void main(String[] args) {
        
        int[] room = new int[10];
        room[0]=4;
        room[1]=6;
        room[2]=5;
        room[3]=1;
        room[4]=18;
        room[5]=17;
        room[6]=14;
        room[7]=2;
        room[8]=7;
        room[9]=6;
        sequence(room);

    }

    static void sequence(int[] room)
    {
        for(int i = 0 ; i < room.length ; i++)
        {
            int sum = room[i];
            int j = i;
            for( ; j <= i+2 ; j++)
            {
                if(sum>=15)    
                {
                    break;
                }
                if(i+1<room.length)
                {
                    sum+=room[i+1];
                }
            }
            if(sum==15)
            {
                System.out.println("Start from : "+i+"th room and Exit from "+j+"th room.");
            }

        }
    }
}
