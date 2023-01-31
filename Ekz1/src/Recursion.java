public class Recursion {
    public int Suma(int f,int a) {
        if (f <= a) {
            return a;
        }
        else {
            return f + Suma(f - 1,a);
        }
    }
}

