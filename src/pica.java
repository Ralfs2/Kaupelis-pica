
import java.text.DecimalFormat;
import java.util.Scanner;

public class pica {
	public static void main(String[] args){
	DecimalFormat df = new DecimalFormat("#.##");
	Scanner scan = new Scanner(System.in);

		String Vards, garoza, piedevas = "Siers";
		char garozasveids; 
		int izmers, piedevuskaits = 0, piedevuskaits2 =0, piedevuskaits3 =0,piedevuskaits4;
		double cena = 0.0, Nodokli, kopa, visskopa;  
		final double nodoklis = 0.08;
		
		try {
	System.out.println("Ieraksti savu vardu: " );
	Vards = scan.nextLine();

	
	double distance = 0;
	double piegadescena = 0;
	System.out.println("Ievadi attalumu no piegades vietas km (0 ja perk uz vietas):");
	distance = scan.nextDouble();
	if (distance == 0){
		piegadescena = 0;
	System.out.println("Nav piegades cena.");}
	else if (distance > 1){
		piegadescena = ((distance * 0.5) +1);
	System.out.println("Piegads cena ir: EUR " + df.format(piegadescena));}
	else if (distance > 0){
		piegadescena = 1.00;
	System.out.println("Piegades cena ir: EUR " + df.format(piegadescena));}


	// Picas izmeri
	System.out.print("kadu picas izmeru velies (diametra centimetros)? (24, 30, 40, vai 50) " );
	izmers = scan.nextInt();
	if (izmers == 24 ){
	cena = 5.99; }
		else if (izmers == 30){
	cena = 7.99;}
		else if (izmers == 40){
	cena = 11.99;}
		else if (izmers == 50){
	cena = 17.99;}
		else if (izmers != 24 && izmers != 30 && izmers != 40 && izmers != 50){
	System.out.println("Tads skaitlis nav pieejams, picas izmers bus 24. " );
	cena = 5.99;}
	scan.nextLine();

	// Garozas veidi
	System.out.print("kadas garozas picu velaties? (P)planu garozu, or (B)biezu garozu (raksti P, vai B,): " );
	garozasveids = scan.nextLine().charAt(0);

	if (garozasveids == 'P' || garozasveids == 'p' ){
		garoza = "Plana garoza";}
	else if (garozasveids == 'B' || garozasveids == 'b' ){
		garoza = "Bieza garoza";}
	else if ( garozasveids != 'P' && garozasveids    != 'p' && garozasveids != 'B' && garozasveids != 'b' ){
	System.out.println("Tads garozas veids nav pieejams, tava pica bus ar planu garozu. " );}
	garoza = "Plana garoza";

	
	// Picu piedevas
	System.out.println("Piedevas ir 1.00 EUR , izvelies piedevas." );
	System.out.println("Var izveleties bekonu, BBQ vai ananasus");
	System.out.println("Vai velies bekonu? (J-ja | N-ne)" );
	piedevuskaits = scan.nextLine().charAt(0);
	if (piedevuskaits == 'J' || piedevuskaits == 'j' ){
		piedevuskaits = 1;
		piedevas = piedevas + ", bekons";}
	else{
		piedevuskaits = 0;
	}
	System.out.println("Vai velaties BBQ merci? (J-ja | N-ne)" );
	piedevuskaits2 = scan.nextLine().charAt(0);
	if (piedevuskaits2 == 'J' || piedevuskaits2 == 'j' ){
		piedevuskaits2 = 1;
	piedevas = piedevas + " un BBQ merce";}
	else{
		piedevuskaits2 = 0;} 
	
	System.out.println("Vai velaties ananasus? (J-ja | N-ne)" );
	piedevuskaits3 = scan.nextLine().charAt(0);
	if (piedevuskaits3 == 'J' || piedevuskaits3 == 'j' ){
		piedevuskaits3 = 1;
	piedevas = piedevas + " un ananasi";}
	else{
		piedevuskaits3 = 0;} 
	scan.close();
	piedevuskaits4 = piedevuskaits + piedevuskaits2 + piedevuskaits3;


	kopa =cena+piedevuskaits4 + piegadescena;
	Nodokli = kopa * nodoklis;
	visskopa = kopa* ( 1 + nodoklis);


	System.out.println(Vards + ", jusu pasutijums:"); 
	System.out.println(izmers + " cm pica");
	System.out.println(garoza +", " + piedevas);
	System.out.println("Cena ar piegadi: " + df.format(kopa)+" EUR");
	System.out.println("Nodoklis: " + df.format(Nodokli)+" EUR");
	System.out.println("Kopa: " + df.format(visskopa)+" EUR");
	
	}catch(Exception e){
		System.out.println("Radas kluda, megini velreiz");
			}
		}
	}
	