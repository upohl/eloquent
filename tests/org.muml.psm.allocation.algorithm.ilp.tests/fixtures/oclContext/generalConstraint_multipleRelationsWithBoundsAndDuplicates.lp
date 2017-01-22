max: 1;

// relation "relationA"
// A should be related to at least 1 and at most 42 packages
relationA_m.pa.A: m.pa.A_m.pb.A + m.pa.A_m.pb.b + m.pa.A_m.pb.c >= 2;
relationA_m.pa.A: m.pa.A_m.pb.A + m.pa.A_m.pb.b + m.pa.A_m.pb.c <= 42;

// relation "allocB"
// A should be either allocated to package "b" or "c"
// Moreover, B should be related/allocated to exactly 1 package
// (but do not relate it to package "A" or "b" (=> it has to be
// related to package "c"))
allocBAndA_m.pa.A: m.pa.A_m.pb.b + m.pa.A_m.pb.c = 1;
allocBAndA_m.pa.B: m.pa.B_m.pb.c = 1;

// relation "duplicateAndNew"
// Duplicate the constraints from "relationA" and
// relate class "B" with package "b" or "c" (the variable
// for package "c" already exists)
duplicateAndNew_m.pa.A: m.pa.A_m.pb.A + m.pa.A_m.pb.b + m.pa.A_m.pb.c >= 2;
duplicateAndNew_m.pa.A: m.pa.A_m.pb.A + m.pa.A_m.pb.b + m.pa.A_m.pb.c <= 42;
duplicateAndNew_m.pa.B: m.pa.B_m.pb.b + m.pa.B_m.pb.c >= 2;
duplicateAndNew_m.pa.B: m.pa.B_m.pb.b + m.pa.B_m.pb.c <= 42;

// relation "relateCAndA"
// Do not relate class "A" with package "c" and do not
// relate class "C" with package "b"
relateCAndA_m.pa.A: m.pa.A_m.pb.A + m.pa.A_m.pb.b = 2;
relateCAndA_m.pa.C: m.pa.C_m.pb.b + m.pa.C_m.pb.c = 2;

// variables for m.pa.A
bin m.pa.A_m.pb.A;
bin m.pa.A_m.pb.b;
bin m.pa.A_m.pb.c;
// first variable for m.pa.B (cf. relation "allocB"
bin m.pa.B_m.pb.c;
// second variable for m.pa.B (cf. relation "duplicateAndNew")
bin m.pa.B_m.pb.b;
// variables for m.pa.C (cf. relation "relateCAndA")
bin m.pa.C_m.pb.b;
bin m.pa.C_m.pb.c;