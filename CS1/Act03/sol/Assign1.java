public class Assign1 {
    public static void main(String[] args) { 
        
        int int_ = 3;
        long long_ = 3L;
        float float_ = 3.0F;
        double double_ = 3.0;
        
        int_ = int_;
        int_ = long_;      // illegal
        int_ = float_;     // illegal
        int_ = double_;    // illegal
        
        long_ = int_;
        long_ = long_;
        long_ = float_;    // illegal
        long_ = double_;   // illegal
        
        float_ = int_;
        float_ = long_;
        float_ = float_;
        float_ = double_;  // illegal
        
        double_ = int_;
        double_ = long_;
        double_ = float_;
        double_ = double_;
        
        int_ = '0';
        int_ = false;      // illegal
        double_ = '0';
        double_ = false;   // illegal
        
    }
}
