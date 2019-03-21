import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem11 {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	private String[] inputs = {"B","J","I","E","C","D","A","G","H","F"};

	public String a1150573588 = "i";
	public int a1979594534 = 13;
	public String a1393627342 = "i";
	public int a409889492 = 6;
	public int a2014931874 = 11;
	public String a980532045 = "i";
	public String a1030589677 = "g";
	public String a11109425 = "e";
	public String a1144518790 = "f";
	public int a1931851808 = 10;
	public String a1249345268 = "g";
	public String a642369719 = "f";
	public int a1920560082 = 12;
	public int a1278053282 = 13;
	public String a1211586799 = "h";
	public int a725363116 = 10;
	public int a2018753675 = 12;
	public String a1722860169 = "g";
	public int a641428659 = 10;
	public String a136296760 = "e";
	public int a1535647353 = 16;
	public int a1265514289 = 6;
	public String a536590795 = "h";
	public String a1207265235 = "g";
	public String a2137325734 = "e";
	public int a414008896 = 10;
	public String a615035064 = "i";
	public int a1540279308 = 2;
	public int a1640511277 = 7;
	public boolean cf = true;
	public String a1757719823 = "h";
	public String a1817180191 = "f";
	public int a829234386 = 3;
	public String a1991122068 = "h";
	public int a531443452 = 9;
	public int a1653973487 = 14;
	public String a1992404643 = "g";

	private void errorCheck() {
	    if((((a136296760.equals("g")) && (a829234386 == 7)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(0);
	    }
	    if((((a11109425.equals("h")) && (a414008896 == 10)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(1);
	    }
	    if((((a409889492 == 3) && (a1249345268.equals("f"))) && (a1207265235.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(2);
	    }
	    if((((a1991122068.equals("i")) && (a2018753675 == 14)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(3);
	    }
	    if((((a1030589677.equals("e")) && (a1535647353 == 16)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(4);
	    }
	    if((((a1640511277 == 4) && (a1249345268.equals("e"))) && (a1207265235.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(5);
	    }
	    if((((a1920560082 == 11) && (a2018753675 == 12)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(6);
	    }
	    if((((a1265514289 == 6) && (a2018753675 == 11)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(7);
	    }
	    if((((a1265514289 == 3) && (a1535647353 == 12)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(8);
	    }
	    if((((a1030589677.equals("f")) && (a829234386 == 5)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(9);
	    }
	    if((((a136296760.equals("f")) && (a829234386 == 7)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(10);
	    }
	    if((((a1653973487 == 16) && (a1249345268.equals("h"))) && (a1207265235.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(11);
	    }
	    if((((a1278053282 == 14) && (a414008896 == 14)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(12);
	    }
	    if((((a1920560082 == 8) && (a2018753675 == 12)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(13);
	    }
	    if((((a1992404643.equals("e")) && (a1535647353 == 10)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(14);
	    }
	    if((((a1030589677.equals("f")) && (a1535647353 == 16)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(15);
	    }
	    if((((a1722860169.equals("i")) && (a1249345268.equals("g"))) && (a1207265235.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(16);
	    }
	    if((((a409889492 == 6) && (a2018753675 == 10)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(17);
	    }
	    if((((a536590795.equals("e")) && (a1535647353 == 11)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(18);
	    }
	    if((((a409889492 == 5) && (a1249345268.equals("f"))) && (a1207265235.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(19);
	    }
	    if((((a531443452 == 13) && (a1535647353 == 17)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(20);
	    }
	    if((((a641428659 == 10) && (a829234386 == 6)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(21);
	    }
	    if((((a642369719.equals("g")) && (a829234386 == 9)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(22);
	    }
	    if((((a1979594534 == 11) && (a2018753675 == 13)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(23);
	    }
	    if((((a1144518790.equals("e")) && (a1535647353 == 15)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(24);
	    }
	    if((((a136296760.equals("i")) && (a829234386 == 7)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(25);
	    }
	    if((((a1540279308 == 1) && (a414008896 == 15)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(26);
	    }
	    if((((a980532045.equals("f")) && (a2018753675 == 7)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(27);
	    }
	    if((((a725363116 == 9) && (a829234386 == 8)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(28);
	    }
	    if((((a1265514289 == 10) && (a1535647353 == 12)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(29);
	    }
	    if((((a1393627342.equals("i")) && (a829234386 == 3)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(30);
	    }
	    if((((a1150573588.equals("h")) && (a1535647353 == 13)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(31);
	    }
	    if((((a725363116 == 6) && (a829234386 == 8)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(32);
	    }
	    if((((a2137325734.equals("f")) && (a1249345268.equals("i"))) && (a1207265235.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(33);
	    }
	    if((((a1979594534 == 14) && (a2018753675 == 13)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(34);
	    }
	    if((((a409889492 == 1) && (a1249345268.equals("f"))) && (a1207265235.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(35);
	    }
	    if((((a536590795.equals("i")) && (a1535647353 == 11)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(36);
	    }
	    if((((a1265514289 == 5) && (a2018753675 == 11)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(37);
	    }
	    if((((a1265514289 == 8) && (a1535647353 == 12)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(38);
	    }
	    if((((a1265514289 == 6) && (a1535647353 == 12)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(39);
	    }
	    if((((a11109425.equals("f")) && (a414008896 == 10)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(40);
	    }
	    if((((a1979594534 == 16) && (a2018753675 == 13)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(41);
	    }
	    if((((a1211586799.equals("h")) && (a414008896 == 12)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(42);
	    }
	    if((((a725363116 == 5) && (a829234386 == 8)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(43);
	    }
	    if((((a1979594534 == 12) && (a2018753675 == 13)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(44);
	    }
	    if((((a1722860169.equals("e")) && (a1249345268.equals("g"))) && (a1207265235.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(45);
	    }
	    if((((a409889492 == 3) && (a2018753675 == 10)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(46);
	    }
	    if((((a1265514289 == 4) && (a2018753675 == 11)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(47);
	    }
	    if((((a136296760.equals("g")) && (a829234386 == 10)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(48);
	    }
	    if((((a136296760.equals("h")) && (a829234386 == 10)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(49);
	    }
	    if((((a1278053282 == 10) && (a414008896 == 14)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(50);
	    }
	    if((((a1817180191.equals("i")) && (a1535647353 == 14)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(51);
	    }
	    if((((a1920560082 == 14) && (a2018753675 == 12)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(52);
	    }
	    if((((a1265514289 == 9) && (a1535647353 == 12)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(53);
	    }
	    if((((a1920560082 == 10) && (a2018753675 == 12)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(54);
	    }
	    if((((a1265514289 == 7) && (a1535647353 == 12)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(55);
	    }
	    if((((a1030589677.equals("h")) && (a829234386 == 5)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(56);
	    }
	    if((((a1144518790.equals("g")) && (a1535647353 == 15)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(57);
	    }
	    if((((a1640511277 == 2) && (a1249345268.equals("e"))) && (a1207265235.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(58);
	    }
	    if((((a1991122068.equals("f")) && (a2018753675 == 9)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(59);
	    }
	    if((((a409889492 == 1) && (a2018753675 == 10)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(60);
	    }
	    if((((a1979594534 == 10) && (a2018753675 == 13)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(61);
	    }
	    if((((a1757719823.equals("h")) && (a414008896 == 16)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(62);
	    }
	    if((((a1278053282 == 11) && (a414008896 == 14)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(63);
	    }
	    if((((a1991122068.equals("h")) && (a2018753675 == 9)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(64);
	    }
	    if((((a641428659 == 7) && (a829234386 == 6)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(65);
	    }
	    if((((a1150573588.equals("i")) && (a1535647353 == 13)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(66);
	    }
	    if((((a1817180191.equals("h")) && (a1535647353 == 14)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(67);
	    }
	    if((((a642369719.equals("e")) && (a829234386 == 9)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(68);
	    }
	    if((((a1150573588.equals("e")) && (a1535647353 == 13)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(69);
	    }
	    if((((a531443452 == 12) && (a1535647353 == 17)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(70);
	    }
	    if((((a2137325734.equals("g")) && (a1249345268.equals("i"))) && (a1207265235.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(71);
	    }
	    if((((a2014931874 == 12) && (a414008896 == 13)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(72);
	    }
	    if((((a1931851808 == 13) && (a414008896 == 17)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(73);
	    }
	    if((((a1030589677.equals("i")) && (a829234386 == 5)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(74);
	    }
	    if((((a725363116 == 11) && (a829234386 == 8)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(75);
	    }
	    if((((a1211586799.equals("f")) && (a414008896 == 11)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(76);
	    }
	    if((((a1030589677.equals("i")) && (a1535647353 == 16)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(77);
	    }
	    if((((a2014931874 == 6) && (a414008896 == 13)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(78);
	    }
	    if((((a1757719823.equals("f")) && (a414008896 == 16)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(79);
	    }
	    if((((a136296760.equals("e")) && (a829234386 == 7)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(80);
	    }
	    if((((a641428659 == 4) && (a829234386 == 6)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(81);
	    }
	    if((((a1757719823.equals("e")) && (a414008896 == 16)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(82);
	    }
	    if((((a136296760.equals("e")) && (a829234386 == 10)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(83);
	    }
	    if((((a1991122068.equals("f")) && (a2018753675 == 14)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(84);
	    }
	    if((((a980532045.equals("h")) && (a2018753675 == 7)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(85);
	    }
	    if((((a531443452 == 7) && (a1535647353 == 17)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(86);
	    }
	    if((((a1817180191.equals("g")) && (a1535647353 == 14)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(87);
	    }
	    if((((a1278053282 == 15) && (a414008896 == 14)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(88);
	    }
	    if((((a980532045.equals("g")) && (a2018753675 == 7)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(89);
	    }
	    if((((a531443452 == 10) && (a1535647353 == 17)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(90);
	    }
	    if((((a536590795.equals("f")) && (a2018753675 == 8)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(91);
	    }
	    if((((a1030589677.equals("h")) && (a1535647353 == 16)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(92);
	    }
	    if((((a536590795.equals("g")) && (a2018753675 == 8)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(93);
	    }
	    if((((a136296760.equals("h")) && (a829234386 == 7)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(94);
	    }
	    if((((a1931851808 == 8) && (a414008896 == 17)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(95);
	    }
	    if((((a1030589677.equals("g")) && (a1535647353 == 16)) && (a1207265235.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(96);
	    }
	    if((((a11109425.equals("e")) && (a414008896 == 10)) && (a1207265235.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(97);
	    }
	    if((((a642369719.equals("f")) && (a829234386 == 9)) && (a1207265235.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(98);
	    }
	    if((((a1979594534 == 13) && (a2018753675 == 13)) && (a1207265235.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(99);
	    }
	}private  void calculateOutputm42(String input) {
    if(((a1207265235.equals("e")) && ((a1535647353 == 12) && ((cf && (input.equals("E"))) && (a1265514289 == 4))))) {
    	cf = false;
    	a1211586799 = "g";
    	a1207265235 = "i";
    	a414008896 = 12; 
    	System.out.println("T");
    } if(((((a1535647353 == 12) && (cf && (input.equals("I")))) && (a1207265235.equals("e"))) && (a1265514289 == 4))) {
    	cf = false;
    	a1817180191 = "f";
    	a1535647353 = 14; 
    	System.out.println("Z");
    } if(((input.equals("J")) && ((a1207265235.equals("e")) && (((a1265514289 == 4) && cf) && (a1535647353 == 12))))) {
    	cf = false;
    	a1207265235 = "g";
    	a2018753675 = 13;
    	a1979594534 = 17; 
    	System.out.println("P");
    } if((((a1207265235.equals("e")) && ((a1535647353 == 12) && ((a1265514289 == 4) && cf))) && (input.equals("D")))) {
    	cf = false;
    	a1207265235 = "g";
    	a2018753675 = 10;
    	a409889492 = 1; 
    	System.out.println("O");
    } 
}
private  void calculateOutputm43(String input) {
    if((((a1535647353 == 12) && ((input.equals("B")) && ((a1207265235.equals("e")) && cf))) && (a1265514289 == 5))) {
    	cf = false;
    	a1207265235 = "f";
    	a1249345268 = "h";
    	a1653973487 = 15; 
    	System.out.println("V");
    } if((((input.equals("C")) && ((cf && (a1265514289 == 5)) && (a1207265235.equals("e")))) && (a1535647353 == 12))) {
    	cf = false;
    	a1207265235 = "f";
    	a1249345268 = "g";
    	a1722860169 = "f"; 
    	System.out.println("Z");
    } if(((a1207265235.equals("e")) && ((a1535647353 == 12) && ((a1265514289 == 5) && ((input.equals("E")) && cf))))) {
    	cf = false;
    	a1265514289 = 4; 
    	System.out.println("Q");
    } if((((a1535647353 == 12) && ((a1207265235.equals("e")) && ((input.equals("G")) && cf))) && (a1265514289 == 5))) {
    	cf = false;
    	a1207265235 = "i";
    	a1757719823 = "h";
    	a414008896 = 16; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm3(String input) {
    if(((a1265514289 == 4) && cf)) {
    	calculateOutputm42(input);
    } 
    if(((a1265514289 == 5) && cf)) {
    	calculateOutputm43(input);
    } 
}
private  void calculateOutputm50(String input) {
    if(((((a1150573588.equals("f")) && ((a1535647353 == 13) && cf)) && (a1207265235.equals("e"))) && (input.equals("F")))) {
    	cf = false;
    	a414008896 = 13;
    	a1207265235 = "i";
    	a2014931874 = 11; 
    	System.out.println("X");
    } if(((a1207265235.equals("e")) && (((a1150573588.equals("f")) && ((a1535647353 == 13) && cf)) && (input.equals("G"))))) {
    	cf = false;
    	a1249345268 = "e";
    	a1207265235 = "f";
    	a1640511277 = 5; 
    	System.out.println("Q");
    } if(((((cf && (input.equals("E"))) && (a1535647353 == 13)) && (a1207265235.equals("e"))) && (a1150573588.equals("f")))) {
    	cf = false;
    	a1207265235 = "f";
    	a1249345268 = "g";
    	a1722860169 = "i"; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm4(String input) {
    if(((a1150573588.equals("f")) && cf)) {
    	calculateOutputm50(input);
    } 
}
private  void calculateOutputm53(String input) {
    if(((input.equals("F")) && ((a1535647353 == 14) && ((a1207265235.equals("e")) && ((a1817180191.equals("e")) && cf))))) {
    	cf = false;
    	a642369719 = "i";
    	a1207265235 = "h";
    	a829234386 = 9; 
    	System.out.println("O");
    } if(((a1207265235.equals("e")) && (((a1817180191.equals("e")) && ((input.equals("D")) && cf)) && (a1535647353 == 14)))) {
    	cf = false;
    	a1150573588 = "h";
    	a1535647353 = 13; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm54(String input) {
    if(((input.equals("B")) && (((cf && (a1535647353 == 14)) && (a1817180191.equals("f"))) && (a1207265235.equals("e"))))) {
    	cf = false;
    	a1207265235 = "f";
    	a1249345268 = "i";
    	a2137325734 = "e"; 
    	System.out.println("S");
    } if(((((input.equals("F")) && ((a1207265235.equals("e")) && cf)) && (a1535647353 == 14)) && (a1817180191.equals("f")))) {
    	cf = false;
    	a1207265235 = "i";
    	a11109425 = "e";
    	a414008896 = 10; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm5(String input) {
    if(((a1817180191.equals("e")) && cf)) {
    	calculateOutputm53(input);
    } 
    if(((a1817180191.equals("f")) && cf)) {
    	calculateOutputm54(input);
    } 
}
private  void calculateOutputm70(String input) {
    if((((a1207265235.equals("f")) && ((cf && (a1249345268.equals("e"))) && (a1640511277 == 3))) && (input.equals("B")))) {
    	cf = false;
    	a1249345268 = "h";
    	a1653973487 = 15; 
    	System.out.println("V");
    } if(((input.equals("G")) && ((a1207265235.equals("f")) && ((a1249345268.equals("e")) && (cf && (a1640511277 == 3)))))) {
    	cf = false;
    	a1249345268 = "h";
    	a1653973487 = 15; 
    	System.out.println("V");
    } if(((input.equals("H")) && (((cf && (a1207265235.equals("f"))) && (a1249345268.equals("e"))) && (a1640511277 == 3)))) {
    	cf = false;
    	a1249345268 = "h";
    	a1653973487 = 15; 
    	System.out.println("X");
    } if((((a1207265235.equals("f")) && ((a1640511277 == 3) && ((a1249345268.equals("e")) && cf))) && (input.equals("C")))) {
    	cf = false;
    	a1207265235 = "h";
    	a829234386 = 8;
    	a725363116 = 11; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm72(String input) {
    if(((((a1207265235.equals("f")) && ((a1249345268.equals("e")) && cf)) && (a1640511277 == 5)) && (input.equals("G")))) {
    	cf = false;
    	a1207265235 = "h";
    	a1393627342 = "g";
    	a829234386 = 3; 
    	System.out.println("W");
    } if(((a1249345268.equals("e")) && (((a1640511277 == 5) && ((a1207265235.equals("f")) && cf)) && (input.equals("I"))))) {
    	cf = false;
    	a1640511277 = 3; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm73(String input) {
    if(((a1640511277 == 8) && (((input.equals("C")) && (cf && (a1249345268.equals("e")))) && (a1207265235.equals("f"))))) {
    	cf = false;
    	a1640511277 = 3; 
    	System.out.println("S");
    } if(((((cf && (a1640511277 == 8)) && (a1207265235.equals("f"))) && (a1249345268.equals("e"))) && (input.equals("I")))) {
    	cf = false;
    	a1207265235 = "i";
    	a414008896 = 17;
    	a1931851808 = 13; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm9(String input) {
    if(((a1640511277 == 3) && cf)) {
    	calculateOutputm70(input);
    } 
    if((cf && (a1640511277 == 5))) {
    	calculateOutputm72(input);
    } 
    if((cf && (a1640511277 == 8))) {
    	calculateOutputm73(input);
    } 
}
private  void calculateOutputm75(String input) {
    if((((((input.equals("J")) && cf) && (a409889492 == 2)) && (a1249345268.equals("f"))) && (a1207265235.equals("f")))) {
    	cf = false;
    	a1535647353 = 12;
    	a1207265235 = "e";
    	a1265514289 = 4; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm10(String input) {
    if((cf && (a409889492 == 2))) {
    	calculateOutputm75(input);
    } 
}
private  void calculateOutputm79(String input) {
    if(((a1207265235.equals("f")) && ((((input.equals("H")) && cf) && (a1249345268.equals("g"))) && (a1722860169.equals("f"))))) {
    	cf = false;
    	a1207265235 = "g";
    	a2018753675 = 12;
    	a1920560082 = 13; 
    	System.out.println("R");
    } if((((((a1249345268.equals("g")) && cf) && (a1722860169.equals("f"))) && (a1207265235.equals("f"))) && (input.equals("G")))) {
    	cf = false;
    	a829234386 = 8;
    	a1207265235 = "h";
    	a725363116 = 6; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm11(String input) {
    if(((a1722860169.equals("f")) && cf)) {
    	calculateOutputm79(input);
    } 
}
private  void calculateOutputm81(String input) {
    if((((input.equals("D")) && (((a1207265235.equals("f")) && cf) && (a1653973487 == 15))) && (a1249345268.equals("h")))) {
    	cf = false;
    	a1211586799 = "e";
    	a1207265235 = "i";
    	a414008896 = 12; 
    	System.out.println("V");
    } if(((a1249345268.equals("h")) && ((input.equals("F")) && ((cf && (a1207265235.equals("f"))) && (a1653973487 == 15))))) {
    	cf = false;
    	a1249345268 = "e";
    	a1640511277 = 8; 
    	System.out.println("Q");
    } if((((input.equals("A")) && ((a1653973487 == 15) && ((a1207265235.equals("f")) && cf))) && (a1249345268.equals("h")))) {
    	cf = false;
    	a2018753675 = 11;
    	a1207265235 = "g";
    	a1265514289 = 5; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm12(String input) {
    if(((a1653973487 == 15) && cf)) {
    	calculateOutputm81(input);
    } 
}
private  void calculateOutputm83(String input) {
    if(((((a1207265235.equals("f")) && (cf && (input.equals("H")))) && (a2137325734.equals("e"))) && (a1249345268.equals("i")))) {
    	cf = false;
    	a1207265235 = "e";
    	a1150573588 = "f";
    	a1535647353 = 13; 
    	System.out.println("V");
    } if(((a1249345268.equals("i")) && ((a2137325734.equals("e")) && ((cf && (input.equals("E"))) && (a1207265235.equals("f")))))) {
    	cf = false;
    	a536590795 = "e";
    	a1207265235 = "e";
    	a1535647353 = 11; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm13(String input) {
    if(((a2137325734.equals("e")) && cf)) {
    	calculateOutputm83(input);
    } 
}
private  void calculateOutputm89(String input) {
    if(((((a1207265235.equals("g")) && ((a980532045.equals("i")) && cf)) && (input.equals("H"))) && (a2018753675 == 7))) {
    	cf = false;
    	a2018753675 = 11;
    	a1265514289 = 7; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm14(String input) {
    if((cf && (a980532045.equals("i")))) {
    	calculateOutputm89(input);
    } 
}
private  void calculateOutputm96(String input) {
    if((((input.equals("D")) && (((a2018753675 == 10) && cf) && (a409889492 == 4))) && (a1207265235.equals("g")))) {
    	cf = false;
    	a1207265235 = "h";
    	a829234386 = 8;
    	a725363116 = 10; 
    	System.out.println("X");
    } if(((((input.equals("F")) && ((a2018753675 == 10) && cf)) && (a1207265235.equals("g"))) && (a409889492 == 4))) {
    	cf = false;
    	a1991122068 = "f";
    	a2018753675 = 14; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm17(String input) {
    if(((a409889492 == 4) && cf)) {
    	calculateOutputm96(input);
    } 
}
private  void calculateOutputm101(String input) {
    if((((a1207265235.equals("g")) && (((input.equals("E")) && cf) && (a1265514289 == 7))) && (a2018753675 == 11))) {
    	cf = false;
    	a829234386 = 6;
    	a1207265235 = "h";
    	a641428659 = 5; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm102(String input) {
    if(((a1265514289 == 10) && (((a2018753675 == 11) && (cf && (input.equals("B")))) && (a1207265235.equals("g"))))) {
    	cf = false;
    	a414008896 = 13;
    	a1207265235 = "i";
    	a2014931874 = 7; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm18(String input) {
    if((cf && (a1265514289 == 7))) {
    	calculateOutputm101(input);
    } 
    if(((a1265514289 == 10) && cf)) {
    	calculateOutputm102(input);
    } 
}
private  void calculateOutputm103(String input) {
    if(((((cf && (a1920560082 == 7)) && (a2018753675 == 12)) && (input.equals("I"))) && (a1207265235.equals("g")))) {
    	cf = false;
    	a1991122068 = "e";
    	a2018753675 = 14; 
    	System.out.println("Z");
    } if(((a2018753675 == 12) && ((a1207265235.equals("g")) && (((a1920560082 == 7) && cf) && (input.equals("F")))))) {
    	cf = false;
    	a1535647353 = 17;
    	a1207265235 = "e";
    	a531443452 = 10; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm107(String input) {
    if(((input.equals("I")) && (((cf && (a1207265235.equals("g"))) && (a2018753675 == 12)) && (a1920560082 == 12)))) {
    	cf = false;
    	a1207265235 = "e";
    	a1535647353 = 12;
    	a1265514289 = 5; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm108(String input) {
    if((((a2018753675 == 12) && ((cf && (a1207265235.equals("g"))) && (input.equals("C")))) && (a1920560082 == 13))) {
    	cf = false;
    	a1207265235 = "h";
    	a829234386 = 8;
    	a725363116 = 10; 
    	System.out.println("X");
    } if((((a2018753675 == 12) && (((a1920560082 == 13) && cf) && (a1207265235.equals("g")))) && (input.equals("J")))) {
    	cf = false;
    	a615035064 = "e";
    	a1207265235 = "h";
    	a829234386 = 4; 
    	System.out.println("Q");
    } if(((a1920560082 == 13) && ((input.equals("E")) && ((a1207265235.equals("g")) && (cf && (a2018753675 == 12)))))) {
    	cf = false;
    	a1249345268 = "g";
    	a1207265235 = "f";
    	a1722860169 = "e"; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm19(String input) {
    if((cf && (a1920560082 == 7))) {
    	calculateOutputm103(input);
    } 
    if(((a1920560082 == 12) && cf)) {
    	calculateOutputm107(input);
    } 
    if((cf && (a1920560082 == 13))) {
    	calculateOutputm108(input);
    } 
}
private  void calculateOutputm115(String input) {
    if(((a1979594534 == 15) && ((a2018753675 == 13) && (((input.equals("B")) && cf) && (a1207265235.equals("g")))))) {
    	cf = false;
    	a2018753675 = 12;
    	a1920560082 = 7; 
    	System.out.println("Z");
    } if(((((a2018753675 == 13) && ((a1979594534 == 15) && cf)) && (input.equals("A"))) && (a1207265235.equals("g")))) {
    	cf = false;
    	a1393627342 = "i";
    	a1207265235 = "h";
    	a829234386 = 3; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm117(String input) {
    if((((a2018753675 == 13) && ((cf && (a1979594534 == 17)) && (input.equals("G")))) && (a1207265235.equals("g")))) {
    	cf = false;
    	a1535647353 = 12;
    	a1207265235 = "e";
    	a1265514289 = 5; 
    	System.out.println("W");
    } if(((((a1207265235.equals("g")) && ((input.equals("H")) && cf)) && (a1979594534 == 17)) && (a2018753675 == 13))) {
    	cf = false;
    	a1211586799 = "e";
    	a1207265235 = "i";
    	a414008896 = 11; 
    	System.out.println("R");
    } if((((a1979594534 == 17) && ((input.equals("D")) && ((a2018753675 == 13) && cf))) && (a1207265235.equals("g")))) {
    	cf = false;
    	a1207265235 = "f";
    	a1249345268 = "e";
    	a1640511277 = 2; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm20(String input) {
    if((cf && (a1979594534 == 15))) {
    	calculateOutputm115(input);
    } 
    if(((a1979594534 == 17) && cf)) {
    	calculateOutputm117(input);
    } 
}
private  void calculateOutputm118(String input) {
    if(((((a1991122068.equals("e")) && ((a2018753675 == 14) && cf)) && (a1207265235.equals("g"))) && (input.equals("C")))) {
    	cf = false;
    	a829234386 = 8;
    	a1207265235 = "h";
    	a725363116 = 10; 
    	System.out.println("W");
    } if(((a2018753675 == 14) && (((a1207265235.equals("g")) && (cf && (input.equals("F")))) && (a1991122068.equals("e"))))) {
    	cf = false;
    	a1207265235 = "h";
    	a1393627342 = "g";
    	a829234386 = 3; 
    	System.out.println("W");
    } if(((a1207265235.equals("g")) && (((a2018753675 == 14) && (cf && (input.equals("G")))) && (a1991122068.equals("e"))))) {
    	cf = false;
    	a1207265235 = "i";
    	a414008896 = 13;
    	a2014931874 = 8; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm120(String input) {
    if(((((input.equals("D")) && ((a1207265235.equals("g")) && cf)) && (a2018753675 == 14)) && (a1991122068.equals("g")))) {
    	cf = false;
    	a2018753675 = 11;
    	a1265514289 = 10; 
    	System.out.println("Q");
    } if((((a1991122068.equals("g")) && (((input.equals("J")) && cf) && (a2018753675 == 14))) && (a1207265235.equals("g")))) {
    	cf = false;
    	a1207265235 = "h";
    	a615035064 = "e";
    	a829234386 = 4; 
    	System.out.println("S");
    } if(((a1207265235.equals("g")) && (((cf && (a1991122068.equals("g"))) && (input.equals("C"))) && (a2018753675 == 14)))) {
    	cf = false;
    	a2018753675 = 13;
    	a1979594534 = 12; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm21(String input) {
    if((cf && (a1991122068.equals("e")))) {
    	calculateOutputm118(input);
    } 
    if(((a1991122068.equals("g")) && cf)) {
    	calculateOutputm120(input);
    } 
}
private  void calculateOutputm122(String input) {
    if((((a829234386 == 3) && ((a1207265235.equals("h")) && ((a1393627342.equals("g")) && cf))) && (input.equals("F")))) {
    	cf = false;
    	a1207265235 = "e";
    	a1535647353 = 12;
    	a1265514289 = 5; 
    	System.out.println("O");
    } if((((((a1207265235.equals("h")) && cf) && (a829234386 == 3)) && (input.equals("J"))) && (a1393627342.equals("g")))) {
    	cf = false;
    	a615035064 = "e";
    	a829234386 = 4; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm22(String input) {
    if((cf && (a1393627342.equals("g")))) {
    	calculateOutputm122(input);
    } 
}
private  void calculateOutputm124(String input) {
    if(((input.equals("B")) && ((a615035064.equals("e")) && ((cf && (a829234386 == 4)) && (a1207265235.equals("h")))))) {
    	cf = false;
    	a1535647353 = 12;
    	a1207265235 = "e";
    	a1265514289 = 5; 
    	System.out.println("O");
    } if(((a829234386 == 4) && ((a1207265235.equals("h")) && (((a615035064.equals("e")) && cf) && (input.equals("D")))))) {
    	cf = false;
    	a1207265235 = "f";
    	a1249345268 = "g";
    	a1722860169 = "f"; 
    	System.out.println("Z");
    } if(((((a1207265235.equals("h")) && (cf && (a615035064.equals("e")))) && (input.equals("F"))) && (a829234386 == 4))) {
    	cf = false;
    	a2018753675 = 12;
    	a1207265235 = "g";
    	a1920560082 = 13; 
    	System.out.println("X");
    } if((((a829234386 == 4) && ((a1207265235.equals("h")) && (cf && (a615035064.equals("e"))))) && (input.equals("A")))) {
    	cf = false;
    	a1207265235 = "g";
    	a2018753675 = 12;
    	a1920560082 = 10; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm125(String input) {
    if(((a829234386 == 4) && (((a615035064.equals("f")) && ((a1207265235.equals("h")) && cf)) && (input.equals("C"))))) {
    	cf = false;
    	a1249345268 = "e";
    	a1207265235 = "f";
    	a1640511277 = 3; 
    	System.out.println("U");
    } if((((a829234386 == 4) && ((cf && (a1207265235.equals("h"))) && (a615035064.equals("f")))) && (input.equals("H")))) {
    	cf = false;
    	a829234386 = 6;
    	a641428659 = 10; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm23(String input) {
    if(((a615035064.equals("e")) && cf)) {
    	calculateOutputm124(input);
    } 
    if(((a615035064.equals("f")) && cf)) {
    	calculateOutputm125(input);
    } 
}
private  void calculateOutputm130(String input) {
    if(((a641428659 == 5) && ((((a1207265235.equals("h")) && cf) && (input.equals("J"))) && (a829234386 == 6)))) {
    	cf = false;
    	a1207265235 = "f";
    	a1249345268 = "e";
    	a1640511277 = 3; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm25(String input) {
    if(((a641428659 == 5) && cf)) {
    	calculateOutputm130(input);
    } 
}
private  void calculateOutputm141(String input) {
    if((((a829234386 == 8) && (((a725363116 == 10) && cf) && (input.equals("E")))) && (a1207265235.equals("h")))) {
    	cf = false;
    	a414008896 = 13;
    	a1207265235 = "i";
    	a2014931874 = 5; 
    	System.out.println("T");
    } if(((input.equals("F")) && ((a829234386 == 8) && ((a725363116 == 10) && (cf && (a1207265235.equals("h"))))))) {
    	cf = false;
    	a1207265235 = "g";
    	a2018753675 = 10;
    	a409889492 = 4; 
    	System.out.println("T");
    } if(((((a829234386 == 8) && ((a1207265235.equals("h")) && cf)) && (input.equals("H"))) && (a725363116 == 10))) {
    	cf = false;
    	a1535647353 = 12;
    	a1207265235 = "e";
    	a1265514289 = 5; 
    	System.out.println("W");
    } if((((input.equals("G")) && (((a829234386 == 8) && cf) && (a1207265235.equals("h")))) && (a725363116 == 10))) {
    	cf = false;
    	a2018753675 = 13;
    	a1207265235 = "g";
    	a1979594534 = 16; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm27(String input) {
    if((cf && (a725363116 == 10))) {
    	calculateOutputm141(input);
    } 
}
private  void calculateOutputm146(String input) {
    if(((((a829234386 == 9) && ((a642369719.equals("i")) && cf)) && (input.equals("D"))) && (a1207265235.equals("h")))) {
    	cf = false;
    	a829234386 = 8;
    	a725363116 = 10; 
    	System.out.println("W");
    } if(((input.equals("J")) && ((a642369719.equals("i")) && ((a829234386 == 9) && ((a1207265235.equals("h")) && cf))))) {
    	cf = false;
    	a1207265235 = "e";
    	a1535647353 = 12;
    	a1265514289 = 5; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm28(String input) {
    if(((a642369719.equals("i")) && cf)) {
    	calculateOutputm146(input);
    } 
}
private  void calculateOutputm153(String input) {
    if(((input.equals("B")) && ((a414008896 == 11) && ((a1211586799.equals("e")) && ((a1207265235.equals("i")) && cf))))) {
    	cf = false;
    	a414008896 = 14;
    	a1278053282 = 17; 
    	System.out.println("W");
    } if((((a1211586799.equals("e")) && ((cf && (a414008896 == 11)) && (input.equals("G")))) && (a1207265235.equals("i")))) {
    	cf = false;
    	a1207265235 = "g";
    	a1991122068 = "g";
    	a2018753675 = 14; 
    	System.out.println("W");
    } if(((((a1211586799.equals("e")) && (cf && (a1207265235.equals("i")))) && (a414008896 == 11)) && (input.equals("J")))) {
    	cf = false;
    	a1817180191 = "e";
    	a1207265235 = "e";
    	a1535647353 = 14; 
    	System.out.println("U");
    } if(((a1211586799.equals("e")) && ((((a1207265235.equals("i")) && cf) && (a414008896 == 11)) && (input.equals("C"))))) {
    	cf = false;
    	a136296760 = "e";
    	a1207265235 = "h";
    	a829234386 = 7; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm31(String input) {
    if((cf && (a1211586799.equals("e")))) {
    	calculateOutputm153(input);
    } 
}
private  void calculateOutputm155(String input) {
    if(((((a1207265235.equals("i")) && ((input.equals("B")) && cf)) && (a1211586799.equals("e"))) && (a414008896 == 12))) {
    	cf = false;
    	a1207265235 = "h";
    	a615035064 = "f";
    	a829234386 = 4; 
    	System.out.println("V");
    } if(((a1211586799.equals("e")) && (((cf && (a414008896 == 12)) && (a1207265235.equals("i"))) && (input.equals("C"))))) {
    	cf = false;
    	a1207265235 = "e";
    	a1535647353 = 12;
    	a1265514289 = 5; 
    	System.out.println("W");
    } if(((((input.equals("H")) && (cf && (a414008896 == 12))) && (a1211586799.equals("e"))) && (a1207265235.equals("i")))) {
    	cf = false;
    	a1535647353 = 12;
    	a1207265235 = "e";
    	a1265514289 = 5; 
    	System.out.println("T");
    } if((((((a1207265235.equals("i")) && cf) && (a414008896 == 12)) && (input.equals("I"))) && (a1211586799.equals("e")))) {
    	cf = false;
    	a1207265235 = "g";
    	a2018753675 = 10;
    	a409889492 = 3; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm156(String input) {
    if(((a414008896 == 12) && ((((a1211586799.equals("g")) && cf) && (input.equals("H"))) && (a1207265235.equals("i"))))) {
    	cf = false;
    	a2018753675 = 13;
    	a1207265235 = "g";
    	a1979594534 = 15; 
    	System.out.println("P");
    } if(((a1207265235.equals("i")) && ((a1211586799.equals("g")) && ((a414008896 == 12) && (cf && (input.equals("F"))))))) {
    	cf = false;
    	a1535647353 = 12;
    	a1207265235 = "e";
    	a1265514289 = 7; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm32(String input) {
    if((cf && (a1211586799.equals("e")))) {
    	calculateOutputm155(input);
    } 
    if((cf && (a1211586799.equals("g")))) {
    	calculateOutputm156(input);
    } 
}
private  void calculateOutputm158(String input) {
    if((((input.equals("C")) && (((a414008896 == 13) && cf) && (a2014931874 == 5))) && (a1207265235.equals("i")))) {
    	cf = false;
    	a2014931874 = 8; 
    	System.out.println("Q");
    } if(((a1207265235.equals("i")) && ((a2014931874 == 5) && (((a414008896 == 13) && cf) && (input.equals("E")))))) {
    	cf = false;
    	a1207265235 = "h";
    	a1393627342 = "g";
    	a829234386 = 3; 
    	System.out.println("X");
    } if(((a2014931874 == 5) && (((input.equals("H")) && ((a414008896 == 13) && cf)) && (a1207265235.equals("i"))))) {
    	cf = false;
    	a1207265235 = "f";
    	a1249345268 = "g";
    	a1722860169 = "f"; 
    	System.out.println("Z");
    } if(((a414008896 == 13) && (((input.equals("D")) && ((a1207265235.equals("i")) && cf)) && (a2014931874 == 5)))) {
    	cf = false;
    	a1207265235 = "e";
    	a1030589677 = "i";
    	a1535647353 = 16; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm160(String input) {
    if(((a414008896 == 13) && (((input.equals("H")) && ((a1207265235.equals("i")) && cf)) && (a2014931874 == 7)))) {
    	cf = false;
    	a1207265235 = "f";
    	a1249345268 = "f";
    	a409889492 = 2; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm161(String input) {
    if((((a2014931874 == 8) && (((a1207265235.equals("i")) && cf) && (input.equals("B")))) && (a414008896 == 13))) {
    	cf = false;
    	a1535647353 = 12;
    	a1207265235 = "e";
    	a1265514289 = 5; 
    	System.out.println("Z");
    } if(((a1207265235.equals("i")) && (((cf && (input.equals("C"))) && (a2014931874 == 8)) && (a414008896 == 13)))) {
    	cf = false;
    	a1207265235 = "e";
    	a1535647353 = 12;
    	a1265514289 = 5; 
    	System.out.println("T");
    } if(((input.equals("F")) && (((cf && (a414008896 == 13)) && (a2014931874 == 8)) && (a1207265235.equals("i"))))) {
    	cf = false;
    	a1207265235 = "g";
    	a2018753675 = 12;
    	a1920560082 = 13; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm162(String input) {
    if((((a414008896 == 13) && ((input.equals("B")) && ((a2014931874 == 11) && cf))) && (a1207265235.equals("i")))) {
    	cf = false;
    	a1207265235 = "h";
    	a829234386 = 8;
    	a725363116 = 10; 
    	System.out.println("W");
    } if((((((a414008896 == 13) && cf) && (input.equals("F"))) && (a1207265235.equals("i"))) && (a2014931874 == 11))) {
    	cf = false;
    	a1207265235 = "h";
    	a1393627342 = "g";
    	a829234386 = 3; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm33(String input) {
    if((cf && (a2014931874 == 5))) {
    	calculateOutputm158(input);
    } 
    if((cf && (a2014931874 == 7))) {
    	calculateOutputm160(input);
    } 
    if((cf && (a2014931874 == 8))) {
    	calculateOutputm161(input);
    } 
    if((cf && (a2014931874 == 11))) {
    	calculateOutputm162(input);
    } 
}
private  void calculateOutputm168(String input) {
    if(((a1207265235.equals("i")) && (((a414008896 == 14) && (cf && (input.equals("D")))) && (a1278053282 == 17)))) {
    	cf = false;
    	a1207265235 = "g";
    	a980532045 = "i";
    	a2018753675 = 7; 
    	System.out.println("R");
    } if(((a1207265235.equals("i")) && ((input.equals("I")) && (((a1278053282 == 17) && cf) && (a414008896 == 14))))) {
    	cf = false;
    	a1817180191 = "h";
    	a1207265235 = "e";
    	a1535647353 = 14; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm34(String input) {
    if(((a1278053282 == 17) && cf)) {
    	calculateOutputm168(input);
    } 
}



public  void calculateOutput(String input) {
 	cf = true;
    if((cf && (a1207265235.equals("e")))) {
    	if((cf && (a1535647353 == 12))) {
    		calculateOutputm3(input);
    	} 
    	if((cf && (a1535647353 == 13))) {
    		calculateOutputm4(input);
    	} 
    	if(((a1535647353 == 14) && cf)) {
    		calculateOutputm5(input);
    	} 
    } 
    if((cf && (a1207265235.equals("f")))) {
    	if((cf && (a1249345268.equals("e")))) {
    		calculateOutputm9(input);
    	} 
    	if((cf && (a1249345268.equals("f")))) {
    		calculateOutputm10(input);
    	} 
    	if(((a1249345268.equals("g")) && cf)) {
    		calculateOutputm11(input);
    	} 
    	if(((a1249345268.equals("h")) && cf)) {
    		calculateOutputm12(input);
    	} 
    	if((cf && (a1249345268.equals("i")))) {
    		calculateOutputm13(input);
    	} 
    } 
    if((cf && (a1207265235.equals("g")))) {
    	if(((a2018753675 == 7) && cf)) {
    		calculateOutputm14(input);
    	} 
    	if((cf && (a2018753675 == 10))) {
    		calculateOutputm17(input);
    	} 
    	if((cf && (a2018753675 == 11))) {
    		calculateOutputm18(input);
    	} 
    	if(((a2018753675 == 12) && cf)) {
    		calculateOutputm19(input);
    	} 
    	if((cf && (a2018753675 == 13))) {
    		calculateOutputm20(input);
    	} 
    	if(((a2018753675 == 14) && cf)) {
    		calculateOutputm21(input);
    	} 
    } 
    if((cf && (a1207265235.equals("h")))) {
    	if((cf && (a829234386 == 3))) {
    		calculateOutputm22(input);
    	} 
    	if(((a829234386 == 4) && cf)) {
    		calculateOutputm23(input);
    	} 
    	if(((a829234386 == 6) && cf)) {
    		calculateOutputm25(input);
    	} 
    	if(((a829234386 == 8) && cf)) {
    		calculateOutputm27(input);
    	} 
    	if((cf && (a829234386 == 9))) {
    		calculateOutputm28(input);
    	} 
    } 
    if(((a1207265235.equals("i")) && cf)) {
    	if(((a414008896 == 11) && cf)) {
    		calculateOutputm31(input);
    	} 
    	if((cf && (a414008896 == 12))) {
    		calculateOutputm32(input);
    	} 
    	if(((a414008896 == 13) && cf)) {
    		calculateOutputm33(input);
    	} 
    	if(((a414008896 == 14) && cf)) {
    		calculateOutputm34(input);
    	} 
    } 

    errorCheck();
    if(cf)
    	throw new IllegalArgumentException("Current state has no transition for this input!");
}


public static void main(String[] args) throws Exception {
	// init system and input reader
	Problem11 eca = new Problem11();

	// main i/o-loop
	while(true) {
		//read input
		String input = stdin.readLine();

		 if((input.equals("B")) && (input.equals("J")) && (input.equals("I")) && (input.equals("E")) && (input.equals("C")) && (input.equals("D")) && (input.equals("A")) && (input.equals("G")) && (input.equals("H")) && (input.equals("F")))
			throw new IllegalArgumentException("Current state has no transition for this input!");
		try {
			//operate eca engine output = 
			eca.calculateOutput(input);
		} catch(IllegalArgumentException e) {
			System.err.println("Invalid input: " + e.getMessage());
		}
	}
}
}