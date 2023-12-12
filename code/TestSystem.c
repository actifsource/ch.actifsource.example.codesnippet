
/**
 * C Example
 */ 
// Test codesnippet function variable
if(Function_1_code(Var_2_code,1)){
    Var_1_code = 77; 
}else{
    Var_1_code = 66;
}
// Test codesnippet cast
Var_1_code = (int)Var_2_code;
// Variable with record type
Var_3_code.f1_default = 88;


/**
 * ST Example
 */ 
// Test codesnippet function variable
IF (Function_1_code(Var_2_code,1)) THEN 
    Var_1_code := 77; 
ELSE 
    Var_1_code := 66;
END_IF;
// Test codesnippet cast
Var_1_code := #warning "Cast is not supported!";
// Variable with record type
Var_3_code.f1_default := 88;


/**
 * C with NameProvider Example
 */ 
// Test codesnippet function variable
if(TestSystem_Function_1_code(TestSystem_Var_2_code,1)){
    TestSystem_Var_1_code = 77; 
}else{
    TestSystem_Var_1_code = 66;
}
// Test codesnippet cast
TestSystem_Var_1_code = (int)TestSystem_Var_2_code;
// Variable with record type
TestSystem_Var_3_code.f1_default = 88;


/* Actifsource ID=[a12233b6-98e4-11ea-8ef1-cb1cd2be9da3,49da7b0b-98e1-11ea-8ef1-cb1cd2be9da3,fvywjJduRYoU4zdZIcosKthPMgo=] */
