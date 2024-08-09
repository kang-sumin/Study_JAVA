package javaPracticeClass.adventure.wrapper;

public class Main {
    public static void main(String[] args) {

        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(10);

        //캐싱 기능 cache values in thr range -128 to 127
        Integer a1 = Integer.valueOf(1);
        Integer a2 = Integer.valueOf(1);
        boolean ret = (a1 == a2);
        System.out.println("ret : " + ret);

        long starTime, endTime;
        long n = 100_000_000;

        //기본형 연산
        int primitiveSum = 0;
        starTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            primitiveSum += 1;
        }
        endTime = System.currentTimeMillis();
        long ret1 = (endTime - starTime);
        System.out.println("기본형 연산에 걸린 시간 : " + ret1 + "ms");

        // 래퍼 클래스 연산
        Integer wrapperSum = Integer.valueOf(0);
        starTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            wrapperSum = Integer.valueOf(wrapperSum.intValue() + 1);
        }
        endTime = System.currentTimeMillis();
        long ret2 = (endTime - starTime);
        System.out.println("래퍼형 연산에 걸린 시간 : " + ret2 + "ms");

        //커스텀 래퍼 클래스 IntBox 연산
        IntBox myWrapperSum = new IntBox(0);
        starTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            IntBox newIntBox = myWrapperSum.increment(1);
            myWrapperSum = newIntBox;
        }
        endTime = System.currentTimeMillis();
        long ret3 = (endTime - starTime);
        System.out.println("커스텀 래퍼형 연산에 걸린 시간 : " + ret3 + "ms");

        //오토 박싱
        int intValue = 10;
        Integer wrapValue = intValue;

        //오토 언박싱
        int wrapValue2 = wrapValue;
    }

}
