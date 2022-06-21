import java.util.Scanner;
public class u_durch_d {

	public static void main(String[] args) {
		System.out.println("Willkommen im Pi-Rechner");
		System.out.println("Wenn der Wert nicht angegeben ist einfach 0 einsetzten");
		double d = 0;
		double r = 0;
		double u = 0;
		double pi = 3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481117450284102701938521105559644622948954930381964428810975665933446128475648233786783165271201909145648566923460348610454326648213393607260249141273;
		double piz = (pi * 2);
		double uz = 0;
		double f = 0;
		Scanner s =new Scanner(System.in);
		System.out.println("Durchmesser hier angeben:");
		d = s.nextDouble();
		
		Scanner a =new Scanner(System.in);
		System.out.println("Radius hier angeben:");
		r = a.nextDouble();
		
		Scanner b =new Scanner(System.in);
		System.out.println("Umfang hier angeben:");
		uz = b.nextDouble();
		
		Scanner c =new Scanner(System.in);
		System.out.println("Flächeninhalt hier angeben:");
		f = c.nextDouble();

		if(uz != 0) {
		System.out.println("Radius: "+(uz / piz));
		System.out.println("Durchmesser: "+(uz / pi));
		System.out.println("Umfang: "+(uz));
		double rh = uz / pi / 2;
		System.out.println("Flächeninhalt: "+(pi * rh * rh));
		}
		
		if(r != 0){
		System.out.println("Radius: "+(r));
		System.out.println("Durchmesser: "+(r * 2));
		System.out.println("Umfang: "+(r * piz));
		System.out.println("Flächeninhalt: "+(pi * r * r));
		}
		
		if(d != 0) {
		System.out.println("Radius: "+(d / 2));
		System.out.println("Durchmesser: "+(d));
		System.out.println("Umfang: "+(d * pi));
		double rhi = d / 2;
		System.out.println("Flächeninhalt: "+(pi * rhi * rhi));
		}
		if(f != 0) {
			double rhie = f / pi;
			double rhier = Math.pow(rhie, 0.5);
			System.out.println("Radius: "+(rhier));
			System.out.println("Durchmesser: "+(rhier * 2));
			System.out.println("Umfang: "+(rhier * 2 * pi));
			System.out.println("Flächeninhalt: "+(f));
			}
	}
}
