public class TesteImpressora {
    public static void main(String[] args) {
        Impressora imp = new Impressora();
        float f1 = 0.25f, f2 = 0.5f;
        String s1 = "Andrer", s2 = "Alfaro", s3 = "Wagner";
        int i1 = 2, i2 = 4;
        imp.exibir(f1);
        imp.exibir(f1, f2);
        imp.exibir(f1, s1);
        imp.exibir(s1, f1);
        imp.exibir(s1, s2, s3);
        imp.exibir(i1, i2, s1);
    }
}
