// in the resulting LP the coefficient for x2 is -1.234567891 
min: 0.0000001001 + 2.111*x1 + -1.2345678910*x2 + 4*x3 + 78;

// -0.00003*x2 => tests if we BigDecimal.stripTrailingZeros() in the code
2.5 + 2.5 + 0.1*x1 + -0.00003*x2 <= 5 + 9.87654*x2 + 6.6*x1 + -5.4321*x3;
1 + 2 + 3 + 4 + 5.1 + x1 + 1*x2 >= 0.3333333333333333*x3 + 0.1;
// also for BigDecimal.stripTrailingZeros()
-0.00000004 <= x1 + -1*x3;

bin x1;
bin x2;
bin x3;