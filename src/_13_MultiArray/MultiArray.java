package _13_MultiArray;

public class MultiArray {
    public static void main(String[] args) {
        // 다차원 배열

        // ex) 영화관 좌석
        // A1 ~ A5
        // B1 ~ B5
        // C1 ~ C5
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 2차원 배열 선언
        String [][] seat = new String[3][5];
        String [][] seats = new String[][]
                {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"}
                };

        System.out.println(seats[1][2]);

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        String[][][] seats3 = {
                {{}, {}, {},},
                {{}, {}, {},},
                {{}, {}, {},},
        };
    }
}
