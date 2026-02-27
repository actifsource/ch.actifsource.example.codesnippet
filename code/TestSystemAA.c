// CMinus

/**
 * C Example
 */ 
// Test codesnippet function variable
if(Function_1_code(Var_2_code,1)){
    Var_1_code = 77; 
}else{
    Var_1_code = 88;
}

// Test codesnippet cast
Var_1_code = (int)Var_2_code;

// Variable with record type
Var_3_code.f1_default = 88;

/**
 * ST Example
 */ 
// Test codesnippet function variable
IF Function_1_code(Var_2_code,1) THEN 
    Var_1_code := 77; 
ELSE 
    Var_1_code := 88;
END_IF;

// Test codesnippet cast
Var_1_code := #warning "Cast is not supported!";

// Variable with record type
Var_3_code.f1_default := 88;

/**
 * C with own NameProvider Example
 */ 
// Test codesnippet function variable
if(TestSystemAA_Function_1_code(TestSystemAA_Var_2_code,1)){
    TestSystemAA_Var_1_code = 77; 
}else{
    TestSystemAA_Var_1_code = 88;
}

// Test codesnippet cast
TestSystemAA_Var_1_code = (int)TestSystemAA_Var_2_code;

// Variable with record type
TestSystemAA_Var_3_code.f1_default = 88;


// STMinus

/**
 * C Example
 */ 
// Test function call
Function_2_code();
Function_1_code(Var_1_code,1);

// Test variable assignement
Var_2_code = Var_3_code;
Var_3_code = "string";
Var_1_code = (1 - (8 / 3)) * 100;

/*
 * $4b0e401f-98e1-11ea-8ef1-cb1cd2be9da3$ comment
 */

// Test for
for(Var_1_code = 1;Var_1_code <= 9;Var_1_code += 1){
    if(Var_1_code != 0){
        Var_2_code = Var_3_code; 
    }else{
        Var_3_code = "string";
    }
}

/**
 * ST Example
 */ 
// Test function call
Function_2_code();
Function_1_code(Var_1_code,1);

// Test variable assignement
Var_2_code := Var_3_code;
Var_3_code := "string";
Var_1_code := (1 - (8 / 3)) * 100;

(* Var_1 comment*)

// Test for
Var_1_code := 1;
WHILE Var_1_code <= 9 DO
    IF Var_1_code <> 0 THEN 
        Var_2_code := Var_3_code; 
    ELSE 
        Var_3_code := "string";
    END_IF;
    Var_1_code := Var_1_code + 1;
END_WHILE;

/**
 * C with own NameProvider Example
 */ 
// Test function call
TestSystemAA_Function_2_code();
TestSystemAA_Function_1_code(TestSystemAA_Var_1_code,1);

// Test variable assignement
TestSystemAA_Var_2_code = TestSystemAA_Var_3_code;
TestSystemAA_Var_3_code = "string";
TestSystemAA_Var_1_code = (1 - (8 / 3)) * 100;

/*
 * $4b0e401f-98e1-11ea-8ef1-cb1cd2be9da3$ comment
 */

// Test for
for(TestSystemAA_Var_1_code = 1;TestSystemAA_Var_1_code <= 9;TestSystemAA_Var_1_code += 1){
    if(TestSystemAA_Var_1_code != 0){
        TestSystemAA_Var_2_code = TestSystemAA_Var_3_code; 
    }else{
        TestSystemAA_Var_3_code = "string";
    }
}


/* Actifsource ID=[a12233b6-98e4-11ea-8ef1-cb1cd2be9da3,49da7b0b-98e1-11ea-8ef1-cb1cd2be9da3,XD/eEHBu8boXHxsBdI42bhPbh5U=] */
