package com.epam.tal5.shkliarov.lab1;


public class Merger {
    // wrong

    public static int[] merge(int[] fst, int[] snd) {

        int[] result = new int[fst.length + snd.length];

        int fstIndex = 0;

        int sndIndex = 0;
        int sum = fstIndex + sndIndex;
        long start = System.currentTimeMillis();
        while (sum != result.length) {
            if (fstIndex == fst.length - 1) {
                System.arraycopy(snd, sndIndex, result, sum, snd.length - sndIndex);
                break;
            }
            if (sndIndex == snd.length - 1) {
                System.arraycopy(fst, fstIndex, result, sum, fst.length - fstIndex);
                System.arraycopy(snd, sndIndex, result, sum, snd.length - sndIndex);
                break;
            }

            if (fstIndex != sndIndex) {

                result[sum++] = fst[fstIndex++];

            } else {

                result[sum++] = snd[sndIndex++];

            }

        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("Merge time is: " + finish + " ms");
        return result;

    }
}
