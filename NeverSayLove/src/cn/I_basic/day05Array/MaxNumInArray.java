package cn.I_basic.day05Array;

public class MaxNumInArray {
    public static void main(String[] args) {
        int []max={32,432,453,2345,1324,5436,12341,536,214343321,54326,115315,543611353,42526543,64323145};
        int max1 = max[0],biggist=max1;
        for (int i = 0; i < max.length; i++) {
            biggist=max[i]>=max1?max[i]:max1;
        max1=biggist;
        }
        System.out.println(biggist);
    }
}
