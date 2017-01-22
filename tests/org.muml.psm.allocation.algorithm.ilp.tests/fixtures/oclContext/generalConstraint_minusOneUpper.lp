max: 1;
// each class should be related to at least 1 package,
// but an upper bound of -1, which means "unbounded", was specified
// (note: since number of model elements is finite, it is always possible
// to compute a real bound (so this is just for "usability"))
differentLowerUpper_m.pa.A: m.pa.A_m.pb.A + m.pa.A_m.pb.b + m.pa.A_m.pb.c >= 1;
differentLowerUpper_m.pa.B: m.pa.B_m.pb.A + m.pa.B_m.pb.b + m.pa.B_m.pb.c >= 1;
differentLowerUpper_m.pa.C: m.pa.C_m.pb.A + m.pa.C_m.pb.b + m.pa.C_m.pb.c >= 1;
// variables for m.pa.A
bin m.pa.A_m.pb.A;
bin m.pa.A_m.pb.b;
bin m.pa.A_m.pb.c;
// variables for m.pa.B
bin m.pa.B_m.pb.A;
bin m.pa.B_m.pb.b;
bin m.pa.B_m.pb.c;
// variables for m.pa.C
bin m.pa.C_m.pb.A;
bin m.pa.C_m.pb.b;
bin m.pa.C_m.pb.c;