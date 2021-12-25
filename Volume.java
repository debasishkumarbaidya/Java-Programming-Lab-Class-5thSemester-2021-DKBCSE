import java.io.*;

interface Volume {
    Double Involume(int s1, int s2, int s3);

    Double Outvolume(int s1, int s2, int s3);
}

class inVol implements Volume {
    public Double Involume(int s1, int s2, int s3) {
        Double p = (0.333333) * java.lang.Math.PI * s1 * s2 * s3;
        return p;
    }

    public Double Outvolume(int s1, int s2, int s3) {
        return null;
    }
}

class outVol implements Volume {
    public Double Outvolume(int s1, int s2, int s3) {
        Double p = (4 / 3) * java.lang.Math.PI * s1 * s2 * s3;
        return p;
    }

    public Double Involume(int s1, int s2, int s3) {
        return null;
    }

}

class VolumeCalculator {
    public static void main(String[] ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of s1: ");
        int s1 = Integer.parseInt(br.readLine());
        System.out.print("Enter the value of s2: ");
        int s2 = Integer.parseInt(br.readLine());
        System.out.print("Enter the value of s3: ");
        int s3 = Integer.parseInt(br.readLine());

        Volume in = new inVol();
        Volume out = new outVol();

        Double invol = in.Involume(s1, s2, s3);
        Double outvol = out.Outvolume(s1, s2, s3);

        System.out.println("Involume : " + invol);
        System.out.println("Outvolume : " + outvol);
    }
}