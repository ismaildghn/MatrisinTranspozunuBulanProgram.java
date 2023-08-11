public class MatrisinTranspozunuBulanProgram {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int satirSayisi = matris.length;
        int stunSayisi = matris[0].length;

        int[][] transpozMatris = new int[stunSayisi][satirSayisi];


        for (int satir = 0; satir < satirSayisi; satir++ ){
            for (int sutun = 0; sutun < stunSayisi; sutun++){
                transpozMatris[sutun][satir] = matris[satir][sutun];
                System.out.println(transpozMatris[sutun][satir] = matris[satir][sutun]);
            }
        }
        System.out.println("Matris:");
        matrisiYazdir(matris);

        System.out.println("Transpoz Matris:");
        matrisiYazdir(transpozMatris);
    }
    public static void matrisiYazdir(int[][] matris) {
        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[0].length; sutun++) {
                System.out.print(matris[satir][sutun] + " ");
            }
            System.out.println();
        }
    }
}


