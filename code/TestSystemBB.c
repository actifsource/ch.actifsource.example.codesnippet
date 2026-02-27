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
if(TestSystemBB_Function_1_code(TestSystemBB_Var_2_code,1)){
    TestSystemBB_Var_1_code = 77; 
}else{
    TestSystemBB_Var_1_code = 88;
}

// Test codesnippet cast
TestSystemBB_Var_1_code = (int)TestSystemBB_Var_2_code;

// Variable with record type
TestSystemBB_Var_3_code.f1_default = 88;


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
TestSystemBB_Function_2_code();
TestSystemBB_Function_1_code(TestSystemBB_Var_1_code,1);

// Test variable assignement
TestSystemBB_Var_2_code = TestSystemBB_Var_3_code;
TestSystemBB_Var_3_code = "string";
TestSystemBB_Var_1_code = (1 - (8 / 3)) * 100;

/*
 * $4b0e401f-98e1-11ea-8ef1-cb1cd2be9da3$ comment
 */

// Test for
for(TestSystemBB_Var_1_code = 1;TestSystemBB_Var_1_code <= 9;TestSystemBB_Var_1_code += 1){
    if(TestSystemBB_Var_1_code != 0){
        TestSystemBB_Var_2_code = TestSystemBB_Var_3_code; 
    }else{
        TestSystemBB_Var_3_code = "string";
    }
}


/* Actifsource ID=[a12233b6-98e4-11ea-8ef1-cb1cd2be9da3,49da7b0b-98e1-11ea-8ef1-cb1cd2be9da3,N745+1SLQ1y04arXAYVO6BhEnQ0=] */
