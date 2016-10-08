# crc-ccitt
Java implementation for 16-bit CRC-CCITT without using tables

The current implementation supports the following CRC-CCITT computation:

1. CRC-CCITT (XModem, ASCII)
2. CRC-CCITT (0xFFFF, ASCII)
3. CRC-CCITT (0x1D0F, ASCII)
4. CRC-CCITT (XModem, HEX)
5. CRC-CCITT (0xFFFF, HEX)
6. CRC-CCITT (0x1D0F, HEX)

Support for Kermit,  and 32-bit computations (both ASCII and HEX) will follow soon.
Main code was based from the 16-bit CRC-CCITT implementation which can be found here http://introcs.cs.princeton.edu/java/61data/CRC16CCITT.java


An example application has been created (ILapCodeGenerator.java) which makes use of CRC-CCITT XModem in generating the unique ILap Code (see Dr. Owenson's blog on reverse-engineering of the iLap Racing transponder which can be found here http://blog.owenson.me/reversing-ilap-race-transponders/)
