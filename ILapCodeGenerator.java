package <YOUR_PACKAGE>;

public class ILapCodeGenerator {

	public static String generateILapCode(String str){
		String[] strArray = new String[6];
		strArray[0] = "F" + str.substring(0, 1);
		strArray[1] = str.substring(1, 3);
		strArray[2] = str.substring(3, 5);
		strArray[3] = str.substring(5, 7);
		
		StringBuffer buff = new StringBuffer();

		for(int i=0; i<4; i++){
			buff.append(strArray[3-i]);
		}			
		
		String xmodem = CRCUtil.getCRC16CCITT(buff.toString(), 0x1021, 0x0000, true);
		strArray[5] = xmodem.substring(2,4);
		strArray[4] = strArray[3];
		strArray[3] = strArray[2];
		strArray[2] = strArray[1];
		strArray[1] = xmodem.substring(0,2);
		
		buff = new StringBuffer();
		for(int i=0; i<6; i++){
			buff.append(strArray[i]);
		}			
		
		Long converted_id = 0x0FFFFFFFFFFFFL - Long.valueOf(buff.toString(), 16);
		
		String hexString = Long.toHexString(converted_id).toUpperCase();
		return (hexString.length() % 2)!=0 ? "0" + hexString : hexString; 
	}

	
	public static void main(String[] args) {
		System.out.println(generateILapCode("1234567"));
    		// outputs "0EADDCBA98D6" in the console
	}

}
