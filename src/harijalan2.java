public class harijalan2 {
    public enum hari { SEN, SEL, RAB, KMS, JMT, SBT, MIN};
    public static void main(String[] args){
        hari har=hari.SEN;

        System.out.println("Hari awal adalah"+ har);
        har= hari.RAB;

        System.out.println("Berarti Sekarang hari"+ har);

        hari t = hari.valueOf("RAB");
        System.out.println("Saya bilang har dan t adalah sama"+ (har==t));
    }

}
