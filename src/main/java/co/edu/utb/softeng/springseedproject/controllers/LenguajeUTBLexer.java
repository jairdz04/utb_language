// $ANTLR 3.5.1 E:\\Documentos\\to explode\\LenguajeUTB.g 2017-05-29 08:52:06

package co.edu.utb.softeng.springseedproject.controllers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LenguajeUTBLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int A=4;
	public static final int AGREGAR=5;
	public static final int ARREGLO=6;
	public static final int BOOLEANO=7;
	public static final int CAMBIAR=8;
	public static final int CARACTER=9;
	public static final int CHAR=10;
	public static final int COMA=11;
	public static final int COMMENT=12;
	public static final int COMO=13;
	public static final int CONJUNCION=14;
	public static final int CONVERTIR=15;
	public static final int COORDENADA=16;
	public static final int DE=17;
	public static final int DECLA=18;
	public static final int DESIGUALDAD=19;
	public static final int DIFERENTE=20;
	public static final int DISYUNCION=21;
	public static final int DIVISION=22;
	public static final int EN=23;
	public static final int ENTERO=24;
	public static final int ENTONCES=25;
	public static final int ES=26;
	public static final int ESCRIBIR=27;
	public static final int ESC_SEQ=28;
	public static final int EXPONENT=29;
	public static final int EXPRESIONES=30;
	public static final int FALSO=31;
	public static final int FIN_FLUJO=32;
	public static final int FIN_MIENTRAS=33;
	public static final int FIN_PARA=34;
	public static final int FIN_SI=35;
	public static final int FIN_VARIABLES=36;
	public static final int FLOAT=37;
	public static final int FLUJO=38;
	public static final int FUNCION=39;
	public static final int HACER=40;
	public static final int HASTA=41;
	public static final int HEX_DIGIT=42;
	public static final int ID=43;
	public static final int IGUAL=44;
	public static final int IGUAL_QUE=45;
	public static final int INICIO=46;
	public static final int INT=47;
	public static final int LEER=48;
	public static final int LISTA=49;
	public static final int LLAMAR=50;
	public static final int MATRIZ=51;
	public static final int MAYOR=52;
	public static final int MAYOR_O_IGUAL_QUE=53;
	public static final int MAYOR_QUE=54;
	public static final int MENOR=55;
	public static final int MENOR_O_IGUAL_QUE=56;
	public static final int MENOR_QUE=57;
	public static final int MIENTRAS=58;
	public static final int MODULO=59;
	public static final int MOSTRAR=60;
	public static final int MULTIPLICACION=61;
	public static final int NO=62;
	public static final int NOMBRE=63;
	public static final int NOMBRE_DEL_EJERCICIO=64;
	public static final int OCTAL_ESC=65;
	public static final int OP_LISTAS=66;
	public static final int PARA=67;
	public static final int PARAMETROS=68;
	public static final int PARENTECIS_ABRE=69;
	public static final int PARENTECIS_CIERRA=70;
	public static final int POR=71;
	public static final int POSICION=72;
	public static final int QUE=73;
	public static final int RANGO=74;
	public static final int REAL=75;
	public static final int RESTA=76;
	public static final int RETORNA=77;
	public static final int RETORNAR=78;
	public static final int SI=79;
	public static final int SINO=80;
	public static final int STRING=81;
	public static final int SUMA=82;
	public static final int TAMANO=83;
	public static final int TEXTO=84;
	public static final int TIPO=85;
	public static final int UNICODE_ESC=86;
	public static final int VALOR=87;
	public static final int VALOR_INICIAL=88;
	public static final int VARIABLES=89;
	public static final int VERDADERO=90;
	public static final int WS=91;

		public String getErrorMessage(RecognitionException e, String[] tokenNames){
				List stack = getRuleInvocationStack(e, this.getClass().getName());
				String msg = null;
				if(e instanceof NoViableAltException){
					NoViableAltException nvae = (NoViableAltException)e;
					msg = "por ahi no es , token: " + e.token; 
				}else {
					msg = super.getErrorMessage(e, tokenNames);
				}
	                        
	                        if(e instanceof MismatchedTokenException){
					MismatchedTokenException R = (MismatchedTokenException)e;
					msg = "Este es : Mismatched " + e.token; 
				}else{
					msg = super.getErrorMessage(e, tokenNames);
				}
	                        
	                        if(e instanceof MismatchedTreeNodeException){
					MismatchedTreeNodeException S = (MismatchedTreeNodeException)e;
					msg = "Este es : MismatchedTreeNodeException " + e.token; 
				}else{
					msg = super.getErrorMessage(e, tokenNames);
				}
	                        if(e instanceof EarlyExitException){
					EarlyExitException t = (EarlyExitException)e;
					msg = "Este es : EarlyExitException " + e.token; 
				}else{
					msg = super.getErrorMessage(e, tokenNames);
				}
	                        if(e instanceof FailedPredicateException){
					FailedPredicateException u = (FailedPredicateException)e;
					msg = "Este es : FailedPredicateException" + e.token; 
				}else{
					msg = super.getErrorMessage(e, tokenNames);
				}
	                        if(e instanceof MismatchedRangeException){
					MismatchedRangeException w = (MismatchedRangeException)e;
					msg = "Este es : MismatchedRangeException" + e.token; 
				}else{
					msg = super.getErrorMessage(e, tokenNames);
				}
	                        if(e instanceof MismatchedSetException){
					MismatchedSetException x = (MismatchedSetException)e;
					msg = "Este es : MismatchedSetException" + e.token; 
				}else{
					msg = super.getErrorMessage(e, tokenNames);
				}
	                        if(e instanceof MismatchedNotSetException){
					MismatchedNotSetException x = (MismatchedNotSetException)e;
					msg = "Este es : MismatchedNotSetException" + e.token; 
				}else{
					msg = super.getErrorMessage(e, tokenNames);
				}
	                        
	                   
			   return msg;
			}
		
		public String getTokenErrorDisplay(Token t){
			return t.toString();
		}


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public LenguajeUTBLexer() {} 
	public LenguajeUTBLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public LenguajeUTBLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "E:\\Documentos\\to explode\\LenguajeUTB.g"; }

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:69:7: ( ':' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:69:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:70:7: ( '<-' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:70:9: '<-'
			{
			match("<-"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:71:7: ( 'x' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:71:9: 'x'
			{
			match('x'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__94"

	// $ANTLR start "NOMBRE_DEL_EJERCICIO"
	public final void mNOMBRE_DEL_EJERCICIO() throws RecognitionException {
		try {
			int _type = NOMBRE_DEL_EJERCICIO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:221:22: ( 'nombre_del_ejercicio' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:221:25: 'nombre_del_ejercicio'
			{
			match("nombre_del_ejercicio"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOMBRE_DEL_EJERCICIO"

	// $ANTLR start "MOSTRAR"
	public final void mMOSTRAR() throws RecognitionException {
		try {
			int _type = MOSTRAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:222:9: ( 'mostrar_en_pantalla' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:222:12: 'mostrar_en_pantalla'
			{
			match("mostrar_en_pantalla"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOSTRAR"

	// $ANTLR start "ENTERO"
	public final void mENTERO() throws RecognitionException {
		try {
			int _type = ENTERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:223:10: ( 'entero' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:223:13: 'entero'
			{
			match("entero"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENTERO"

	// $ANTLR start "NOMBRE"
	public final void mNOMBRE() throws RecognitionException {
		try {
			int _type = NOMBRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:224:8: ( 'nombre' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:224:10: 'nombre'
			{
			match("nombre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOMBRE"

	// $ANTLR start "TIPO"
	public final void mTIPO() throws RecognitionException {
		try {
			int _type = TIPO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:225:6: ( 'tipo' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:225:8: 'tipo'
			{
			match("tipo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIPO"

	// $ANTLR start "TAMANO"
	public final void mTAMANO() throws RecognitionException {
		try {
			int _type = TAMANO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:226:8: ( 'tamano' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:226:11: 'tamano'
			{
			match("tamano"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAMANO"

	// $ANTLR start "VALOR_INICIAL"
	public final void mVALOR_INICIAL() throws RecognitionException {
		try {
			int _type = VALOR_INICIAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:227:14: ( 'valor_inicial' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:227:17: 'valor_inicial'
			{
			match("valor_inicial"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VALOR_INICIAL"

	// $ANTLR start "ENTONCES"
	public final void mENTONCES() throws RecognitionException {
		try {
			int _type = ENTONCES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:228:10: ( 'entonces' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:228:13: 'entonces'
			{
			match("entonces"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENTONCES"

	// $ANTLR start "CAMBIAR"
	public final void mCAMBIAR() throws RecognitionException {
		try {
			int _type = CAMBIAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:229:9: ( 'cambiar' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:229:11: 'cambiar'
			{
			match("cambiar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CAMBIAR"

	// $ANTLR start "VALOR"
	public final void mVALOR() throws RecognitionException {
		try {
			int _type = VALOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:230:7: ( 'valor' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:230:9: 'valor'
			{
			match("valor"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VALOR"

	// $ANTLR start "POR"
	public final void mPOR() throws RecognitionException {
		try {
			int _type = POR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:231:5: ( 'por' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:231:7: 'por'
			{
			match("por"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POR"

	// $ANTLR start "CONVERTIR"
	public final void mCONVERTIR() throws RecognitionException {
		try {
			int _type = CONVERTIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:232:10: ( 'convertir' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:232:12: 'convertir'
			{
			match("convertir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONVERTIR"

	// $ANTLR start "AGREGAR"
	public final void mAGREGAR() throws RecognitionException {
		try {
			int _type = AGREGAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:233:9: ( 'agregar' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:233:11: 'agregar'
			{
			match("agregar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AGREGAR"

	// $ANTLR start "POSICION"
	public final void mPOSICION() throws RecognitionException {
		try {
			int _type = POSICION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:234:9: ( 'en_la_posicion' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:234:12: 'en_la_posicion'
			{
			match("en_la_posicion"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POSICION"

	// $ANTLR start "COORDENADA"
	public final void mCOORDENADA() throws RecognitionException {
		try {
			int _type = COORDENADA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:235:11: ( 'en_la_coordenada' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:235:14: 'en_la_coordenada'
			{
			match("en_la_coordenada"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COORDENADA"

	// $ANTLR start "EXPRESIONES"
	public final void mEXPRESIONES() throws RecognitionException {
		try {
			int _type = EXPRESIONES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:239:12: ( 'expresiones' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:239:14: 'expresiones'
			{
			match("expresiones"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPRESIONES"

	// $ANTLR start "OP_LISTAS"
	public final void mOP_LISTAS() throws RecognitionException {
		try {
			int _type = OP_LISTAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:240:10: ( 'operaciones_listas' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:240:12: 'operaciones_listas'
			{
			match("operaciones_listas"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_LISTAS"

	// $ANTLR start "PARENTECIS_ABRE"
	public final void mPARENTECIS_ABRE() throws RecognitionException {
		try {
			int _type = PARENTECIS_ABRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:241:16: ( '(' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:241:18: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARENTECIS_ABRE"

	// $ANTLR start "PARENTECIS_CIERRA"
	public final void mPARENTECIS_CIERRA() throws RecognitionException {
		try {
			int _type = PARENTECIS_CIERRA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:242:18: ( ')' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:242:20: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARENTECIS_CIERRA"

	// $ANTLR start "COMA"
	public final void mCOMA() throws RecognitionException {
		try {
			int _type = COMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:243:6: ( ',' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:243:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMA"

	// $ANTLR start "HACER"
	public final void mHACER() throws RecognitionException {
		try {
			int _type = HACER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:248:9: ( 'hacer' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:248:12: 'hacer'
			{
			match("hacer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HACER"

	// $ANTLR start "PARAMETROS"
	public final void mPARAMETROS() throws RecognitionException {
		try {
			int _type = PARAMETROS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:249:11: ( 'parametros' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:249:14: 'parametros'
			{
			match("parametros"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARAMETROS"

	// $ANTLR start "VARIABLES"
	public final void mVARIABLES() throws RecognitionException {
		try {
			int _type = VARIABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:250:11: ( 'variables' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:250:18: 'variables'
			{
			match("variables"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLES"

	// $ANTLR start "TEXTO"
	public final void mTEXTO() throws RecognitionException {
		try {
			int _type = TEXTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:251:8: ( 'texto' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:251:11: 'texto'
			{
			match("texto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXTO"

	// $ANTLR start "INICIO"
	public final void mINICIO() throws RecognitionException {
		try {
			int _type = INICIO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:252:8: ( 'inicio' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:252:11: 'inicio'
			{
			match("inicio"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INICIO"

	// $ANTLR start "ARREGLO"
	public final void mARREGLO() throws RecognitionException {
		try {
			int _type = ARREGLO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:253:9: ( 'arreglo' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:253:18: 'arreglo'
			{
			match("arreglo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARREGLO"

	// $ANTLR start "FIN_VARIABLES"
	public final void mFIN_VARIABLES() throws RecognitionException {
		try {
			int _type = FIN_VARIABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:254:14: ( 'fin_variables' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:254:17: 'fin_variables'
			{
			match("fin_variables"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIN_VARIABLES"

	// $ANTLR start "REAL"
	public final void mREAL() throws RecognitionException {
		try {
			int _type = REAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:255:6: ( 'real' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:255:9: 'real'
			{
			match("real"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL"

	// $ANTLR start "MIENTRAS"
	public final void mMIENTRAS() throws RecognitionException {
		try {
			int _type = MIENTRAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:256:10: ( 'mientras' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:256:13: 'mientras'
			{
			match("mientras"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIENTRAS"

	// $ANTLR start "DE"
	public final void mDE() throws RecognitionException {
		try {
			int _type = DE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:257:3: ( 'de' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:257:14: 'de'
			{
			match("de"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DE"

	// $ANTLR start "MATRIZ"
	public final void mMATRIZ() throws RecognitionException {
		try {
			int _type = MATRIZ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:258:9: ( 'matriz' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:258:12: 'matriz'
			{
			match("matriz"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MATRIZ"

	// $ANTLR start "LISTA"
	public final void mLISTA() throws RecognitionException {
		try {
			int _type = LISTA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:259:7: ( 'lista' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:259:9: 'lista'
			{
			match("lista"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LISTA"

	// $ANTLR start "FLUJO"
	public final void mFLUJO() throws RecognitionException {
		try {
			int _type = FLUJO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:260:7: ( 'flujo' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:260:16: 'flujo'
			{
			match("flujo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLUJO"

	// $ANTLR start "BOOLEANO"
	public final void mBOOLEANO() throws RecognitionException {
		try {
			int _type = BOOLEANO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:261:9: ( 'booleano' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:261:12: 'booleano'
			{
			match("booleano"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEANO"

	// $ANTLR start "FUNCION"
	public final void mFUNCION() throws RecognitionException {
		try {
			int _type = FUNCION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:262:9: ( 'funcion' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:262:18: 'funcion'
			{
			match("funcion"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCION"

	// $ANTLR start "LLAMAR"
	public final void mLLAMAR() throws RecognitionException {
		try {
			int _type = LLAMAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:263:7: ( 'llamar' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:263:18: 'llamar'
			{
			match("llamar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LLAMAR"

	// $ANTLR start "CARACTER"
	public final void mCARACTER() throws RecognitionException {
		try {
			int _type = CARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:264:9: ( 'caracter' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:264:18: 'caracter'
			{
			match("caracter"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CARACTER"

	// $ANTLR start "MAYOR"
	public final void mMAYOR() throws RecognitionException {
		try {
			int _type = MAYOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:265:7: ( 'mayor' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:265:10: 'mayor'
			{
			match("mayor"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAYOR"

	// $ANTLR start "ESCRIBIR"
	public final void mESCRIBIR() throws RecognitionException {
		try {
			int _type = ESCRIBIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:266:9: ( 'escribir' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:266:18: 'escribir'
			{
			match("escribir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESCRIBIR"

	// $ANTLR start "FIN_FLUJO"
	public final void mFIN_FLUJO() throws RecognitionException {
		try {
			int _type = FIN_FLUJO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:267:10: ( 'fin_flujo' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:267:18: 'fin_flujo'
			{
			match("fin_flujo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIN_FLUJO"

	// $ANTLR start "COMO"
	public final void mCOMO() throws RecognitionException {
		try {
			int _type = COMO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:268:5: ( 'como' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:268:18: 'como'
			{
			match("como"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMO"

	// $ANTLR start "PARA"
	public final void mPARA() throws RecognitionException {
		try {
			int _type = PARA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:269:6: ( 'para_cada' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:269:18: 'para_cada'
			{
			match("para_cada"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARA"

	// $ANTLR start "RETORNAR"
	public final void mRETORNAR() throws RecognitionException {
		try {
			int _type = RETORNAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:270:9: ( 'retornar' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:270:18: 'retornar'
			{
			match("retornar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETORNAR"

	// $ANTLR start "LEER"
	public final void mLEER() throws RecognitionException {
		try {
			int _type = LEER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:271:5: ( 'leer' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:271:18: 'leer'
			{
			match("leer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEER"

	// $ANTLR start "SI"
	public final void mSI() throws RecognitionException {
		try {
			int _type = SI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:272:3: ( 'si' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:272:18: 'si'
			{
			match("si"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SI"

	// $ANTLR start "HASTA"
	public final void mHASTA() throws RecognitionException {
		try {
			int _type = HASTA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:273:6: ( 'hasta' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:273:18: 'hasta'
			{
			match("hasta"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HASTA"

	// $ANTLR start "SINO"
	public final void mSINO() throws RecognitionException {
		try {
			int _type = SINO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:274:5: ( 'sino' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:274:18: 'sino'
			{
			match("sino"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINO"

	// $ANTLR start "VERDADERO"
	public final void mVERDADERO() throws RecognitionException {
		try {
			int _type = VERDADERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:275:10: ( 'verdadero' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:275:18: 'verdadero'
			{
			match("verdadero"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VERDADERO"

	// $ANTLR start "RETORNA"
	public final void mRETORNA() throws RecognitionException {
		try {
			int _type = RETORNA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:276:8: ( 'retorna' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:276:18: 'retorna'
			{
			match("retorna"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETORNA"

	// $ANTLR start "FALSO"
	public final void mFALSO() throws RecognitionException {
		try {
			int _type = FALSO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:277:6: ( 'falso' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:277:18: 'falso'
			{
			match("falso"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSO"

	// $ANTLR start "FIN_SI"
	public final void mFIN_SI() throws RecognitionException {
		try {
			int _type = FIN_SI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:278:7: ( 'fin_si' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:278:19: 'fin_si'
			{
			match("fin_si"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIN_SI"

	// $ANTLR start "FIN_PARA"
	public final void mFIN_PARA() throws RecognitionException {
		try {
			int _type = FIN_PARA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:279:9: ( 'fin_para' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:279:11: 'fin_para'
			{
			match("fin_para"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIN_PARA"

	// $ANTLR start "FIN_MIENTRAS"
	public final void mFIN_MIENTRAS() throws RecognitionException {
		try {
			int _type = FIN_MIENTRAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:280:13: ( 'fin_mientras' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:280:15: 'fin_mientras'
			{
			match("fin_mientras"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIN_MIENTRAS"

	// $ANTLR start "NO"
	public final void mNO() throws RecognitionException {
		try {
			int _type = NO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:281:3: ( 'no' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:281:18: 'no'
			{
			match("no"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NO"

	// $ANTLR start "MENOR"
	public final void mMENOR() throws RecognitionException {
		try {
			int _type = MENOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:282:6: ( 'menor' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:282:10: 'menor'
			{
			match("menor"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MENOR"

	// $ANTLR start "QUE"
	public final void mQUE() throws RecognitionException {
		try {
			int _type = QUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:283:4: ( 'que' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:283:8: 'que'
			{
			match("que"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUE"

	// $ANTLR start "IGUAL"
	public final void mIGUAL() throws RecognitionException {
		try {
			int _type = IGUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:284:6: ( 'igual' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:284:10: 'igual'
			{
			match("igual"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IGUAL"

	// $ANTLR start "DIFERENTE"
	public final void mDIFERENTE() throws RecognitionException {
		try {
			int _type = DIFERENTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:285:10: ( 'diferente' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:285:18: 'diferente'
			{
			match("diferente"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIFERENTE"

	// $ANTLR start "ES"
	public final void mES() throws RecognitionException {
		try {
			int _type = ES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:286:3: ( 'es' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:286:7: 'es'
			{
			match("es"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ES"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			int _type = A;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:287:3: ( 'a' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:287:5: 'a'
			{
			match('a'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "A"

	// $ANTLR start "EN"
	public final void mEN() throws RecognitionException {
		try {
			int _type = EN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:288:4: ( 'en' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:288:6: 'en'
			{
			match("en"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EN"

	// $ANTLR start "RANGO"
	public final void mRANGO() throws RecognitionException {
		try {
			int _type = RANGO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:289:7: ( 'rango' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:289:9: 'rango'
			{
			match("rango"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RANGO"

	// $ANTLR start "DECLA"
	public final void mDECLA() throws RecognitionException {
		try {
			int _type = DECLA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:290:7: ( 'declaraciones' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:290:9: 'declaraciones'
			{
			match("declaraciones"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECLA"

	// $ANTLR start "SUMA"
	public final void mSUMA() throws RecognitionException {
		try {
			int _type = SUMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:294:6: ( '+' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:294:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUMA"

	// $ANTLR start "RESTA"
	public final void mRESTA() throws RecognitionException {
		try {
			int _type = RESTA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:295:7: ( '-' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:295:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RESTA"

	// $ANTLR start "MULTIPLICACION"
	public final void mMULTIPLICACION() throws RecognitionException {
		try {
			int _type = MULTIPLICACION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:296:15: ( '*' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:296:18: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTIPLICACION"

	// $ANTLR start "DIVISION"
	public final void mDIVISION() throws RecognitionException {
		try {
			int _type = DIVISION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:297:9: ( '/' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:297:12: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVISION"

	// $ANTLR start "MODULO"
	public final void mMODULO() throws RecognitionException {
		try {
			int _type = MODULO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:298:8: ( '%' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:298:11: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODULO"

	// $ANTLR start "IGUAL_QUE"
	public final void mIGUAL_QUE() throws RecognitionException {
		try {
			int _type = IGUAL_QUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:301:15: ( 'igual_que' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:301:17: 'igual_que'
			{
			match("igual_que"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IGUAL_QUE"

	// $ANTLR start "MAYOR_QUE"
	public final void mMAYOR_QUE() throws RecognitionException {
		try {
			int _type = MAYOR_QUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:302:11: ( 'mayor_que' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:302:13: 'mayor_que'
			{
			match("mayor_que"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAYOR_QUE"

	// $ANTLR start "MENOR_QUE"
	public final void mMENOR_QUE() throws RecognitionException {
		try {
			int _type = MENOR_QUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:303:11: ( 'menor_que' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:303:13: 'menor_que'
			{
			match("menor_que"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MENOR_QUE"

	// $ANTLR start "MAYOR_O_IGUAL_QUE"
	public final void mMAYOR_O_IGUAL_QUE() throws RecognitionException {
		try {
			int _type = MAYOR_O_IGUAL_QUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:304:19: ( 'mayor_o_igual que' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:304:20: 'mayor_o_igual que'
			{
			match("mayor_o_igual que"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAYOR_O_IGUAL_QUE"

	// $ANTLR start "MENOR_O_IGUAL_QUE"
	public final void mMENOR_O_IGUAL_QUE() throws RecognitionException {
		try {
			int _type = MENOR_O_IGUAL_QUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:305:19: ( 'menor_o_igual que' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:305:20: 'menor_o_igual que'
			{
			match("menor_o_igual que"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MENOR_O_IGUAL_QUE"

	// $ANTLR start "DESIGUALDAD"
	public final void mDESIGUALDAD() throws RecognitionException {
		try {
			int _type = DESIGUALDAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:306:13: ( 'no_es_igual_a' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:306:15: 'no_es_igual_a'
			{
			match("no_es_igual_a"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DESIGUALDAD"

	// $ANTLR start "CONJUNCION"
	public final void mCONJUNCION() throws RecognitionException {
		try {
			int _type = CONJUNCION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:309:11: ( 'y' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:309:13: 'y'
			{
			match('y'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJUNCION"

	// $ANTLR start "DISYUNCION"
	public final void mDISYUNCION() throws RecognitionException {
		try {
			int _type = DISYUNCION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:310:11: ( 'o' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:310:13: 'o'
			{
			match('o'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DISYUNCION"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:320:5: ( '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:320:7: '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			match('$'); 
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// E:\\Documentos\\to explode\\LenguajeUTB.g:320:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:323:5: ( ( '0' .. '9' )+ )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:323:7: ( '0' .. '9' )+
			{
			// E:\\Documentos\\to explode\\LenguajeUTB.g:323:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:327:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:327:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// E:\\Documentos\\to explode\\LenguajeUTB.g:327:9: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// E:\\Documentos\\to explode\\LenguajeUTB.g:327:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					// E:\\Documentos\\to explode\\LenguajeUTB.g:327:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:327:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:328:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// E:\\Documentos\\to explode\\LenguajeUTB.g:328:13: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// E:\\Documentos\\to explode\\LenguajeUTB.g:328:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:328:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:329:9: ( '0' .. '9' )+ EXPONENT
					{
					// E:\\Documentos\\to explode\\LenguajeUTB.g:329:9: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:333:5: ( 'nota:' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:333:9: 'nota:' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("nota:"); 

			// E:\\Documentos\\to explode\\LenguajeUTB.g:333:17: (~ ( '\\n' | '\\r' ) )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop10;
				}
			}

			// E:\\Documentos\\to explode\\LenguajeUTB.g:333:31: ( '\\r' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\r') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:333:31: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:336:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:336:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:344:5: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' ) |~ ( '\\\\' | '\"' ) )* '\"' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:344:8: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' ) |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// E:\\Documentos\\to explode\\LenguajeUTB.g:344:35: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' ) |~ ( '\\\\' | '\"' ) )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\u0000' && LA12_0 <= '!')||(LA12_0 >= '#' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop12;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Documentos\\to explode\\LenguajeUTB.g:347:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:347:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// E:\\Documentos\\to explode\\LenguajeUTB.g:347:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='\\') ) {
				alt13=1;
			}
			else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '&')||(LA13_0 >= '(' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:347:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:347:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:352:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:352:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// E:\\Documentos\\to explode\\LenguajeUTB.g:352:22: ( '+' | '-' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='+'||LA14_0=='-') ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// E:\\Documentos\\to explode\\LenguajeUTB.g:352:33: ( '0' .. '9' )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:355:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:359:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt16=3;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt16=1;
					}
					break;
				case 'u':
					{
					alt16=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt16=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:359:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:360:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:361:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:366:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\\') ) {
				int LA17_1 = input.LA(2);
				if ( ((LA17_1 >= '0' && LA17_1 <= '3')) ) {
					int LA17_2 = input.LA(3);
					if ( ((LA17_2 >= '0' && LA17_2 <= '7')) ) {
						int LA17_4 = input.LA(4);
						if ( ((LA17_4 >= '0' && LA17_4 <= '7')) ) {
							alt17=1;
						}

						else {
							alt17=2;
						}

					}

					else {
						alt17=3;
					}

				}
				else if ( ((LA17_1 >= '4' && LA17_1 <= '7')) ) {
					int LA17_3 = input.LA(3);
					if ( ((LA17_3 >= '0' && LA17_3 <= '7')) ) {
						alt17=2;
					}

					else {
						alt17=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:366:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:367:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:368:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:373:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:373:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// E:\\Documentos\\to explode\\LenguajeUTB.g:1:8: ( T__92 | T__93 | T__94 | NOMBRE_DEL_EJERCICIO | MOSTRAR | ENTERO | NOMBRE | TIPO | TAMANO | VALOR_INICIAL | ENTONCES | CAMBIAR | VALOR | POR | CONVERTIR | AGREGAR | POSICION | COORDENADA | EXPRESIONES | OP_LISTAS | PARENTECIS_ABRE | PARENTECIS_CIERRA | COMA | HACER | PARAMETROS | VARIABLES | TEXTO | INICIO | ARREGLO | FIN_VARIABLES | REAL | MIENTRAS | DE | MATRIZ | LISTA | FLUJO | BOOLEANO | FUNCION | LLAMAR | CARACTER | MAYOR | ESCRIBIR | FIN_FLUJO | COMO | PARA | RETORNAR | LEER | SI | HASTA | SINO | VERDADERO | RETORNA | FALSO | FIN_SI | FIN_PARA | FIN_MIENTRAS | NO | MENOR | QUE | IGUAL | DIFERENTE | ES | A | EN | RANGO | DECLA | SUMA | RESTA | MULTIPLICACION | DIVISION | MODULO | IGUAL_QUE | MAYOR_QUE | MENOR_QUE | MAYOR_O_IGUAL_QUE | MENOR_O_IGUAL_QUE | DESIGUALDAD | CONJUNCION | DISYUNCION | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt18=86;
		alt18 = dfa18.predict(input);
		switch (alt18) {
			case 1 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:10: T__92
				{
				mT__92(); 

				}
				break;
			case 2 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:16: T__93
				{
				mT__93(); 

				}
				break;
			case 3 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:22: T__94
				{
				mT__94(); 

				}
				break;
			case 4 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:28: NOMBRE_DEL_EJERCICIO
				{
				mNOMBRE_DEL_EJERCICIO(); 

				}
				break;
			case 5 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:49: MOSTRAR
				{
				mMOSTRAR(); 

				}
				break;
			case 6 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:57: ENTERO
				{
				mENTERO(); 

				}
				break;
			case 7 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:64: NOMBRE
				{
				mNOMBRE(); 

				}
				break;
			case 8 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:71: TIPO
				{
				mTIPO(); 

				}
				break;
			case 9 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:76: TAMANO
				{
				mTAMANO(); 

				}
				break;
			case 10 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:83: VALOR_INICIAL
				{
				mVALOR_INICIAL(); 

				}
				break;
			case 11 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:97: ENTONCES
				{
				mENTONCES(); 

				}
				break;
			case 12 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:106: CAMBIAR
				{
				mCAMBIAR(); 

				}
				break;
			case 13 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:114: VALOR
				{
				mVALOR(); 

				}
				break;
			case 14 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:120: POR
				{
				mPOR(); 

				}
				break;
			case 15 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:124: CONVERTIR
				{
				mCONVERTIR(); 

				}
				break;
			case 16 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:134: AGREGAR
				{
				mAGREGAR(); 

				}
				break;
			case 17 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:142: POSICION
				{
				mPOSICION(); 

				}
				break;
			case 18 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:151: COORDENADA
				{
				mCOORDENADA(); 

				}
				break;
			case 19 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:162: EXPRESIONES
				{
				mEXPRESIONES(); 

				}
				break;
			case 20 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:174: OP_LISTAS
				{
				mOP_LISTAS(); 

				}
				break;
			case 21 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:184: PARENTECIS_ABRE
				{
				mPARENTECIS_ABRE(); 

				}
				break;
			case 22 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:200: PARENTECIS_CIERRA
				{
				mPARENTECIS_CIERRA(); 

				}
				break;
			case 23 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:218: COMA
				{
				mCOMA(); 

				}
				break;
			case 24 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:223: HACER
				{
				mHACER(); 

				}
				break;
			case 25 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:229: PARAMETROS
				{
				mPARAMETROS(); 

				}
				break;
			case 26 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:240: VARIABLES
				{
				mVARIABLES(); 

				}
				break;
			case 27 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:250: TEXTO
				{
				mTEXTO(); 

				}
				break;
			case 28 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:256: INICIO
				{
				mINICIO(); 

				}
				break;
			case 29 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:263: ARREGLO
				{
				mARREGLO(); 

				}
				break;
			case 30 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:271: FIN_VARIABLES
				{
				mFIN_VARIABLES(); 

				}
				break;
			case 31 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:285: REAL
				{
				mREAL(); 

				}
				break;
			case 32 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:290: MIENTRAS
				{
				mMIENTRAS(); 

				}
				break;
			case 33 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:299: DE
				{
				mDE(); 

				}
				break;
			case 34 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:302: MATRIZ
				{
				mMATRIZ(); 

				}
				break;
			case 35 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:309: LISTA
				{
				mLISTA(); 

				}
				break;
			case 36 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:315: FLUJO
				{
				mFLUJO(); 

				}
				break;
			case 37 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:321: BOOLEANO
				{
				mBOOLEANO(); 

				}
				break;
			case 38 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:330: FUNCION
				{
				mFUNCION(); 

				}
				break;
			case 39 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:338: LLAMAR
				{
				mLLAMAR(); 

				}
				break;
			case 40 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:345: CARACTER
				{
				mCARACTER(); 

				}
				break;
			case 41 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:354: MAYOR
				{
				mMAYOR(); 

				}
				break;
			case 42 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:360: ESCRIBIR
				{
				mESCRIBIR(); 

				}
				break;
			case 43 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:369: FIN_FLUJO
				{
				mFIN_FLUJO(); 

				}
				break;
			case 44 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:379: COMO
				{
				mCOMO(); 

				}
				break;
			case 45 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:384: PARA
				{
				mPARA(); 

				}
				break;
			case 46 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:389: RETORNAR
				{
				mRETORNAR(); 

				}
				break;
			case 47 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:398: LEER
				{
				mLEER(); 

				}
				break;
			case 48 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:403: SI
				{
				mSI(); 

				}
				break;
			case 49 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:406: HASTA
				{
				mHASTA(); 

				}
				break;
			case 50 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:412: SINO
				{
				mSINO(); 

				}
				break;
			case 51 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:417: VERDADERO
				{
				mVERDADERO(); 

				}
				break;
			case 52 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:427: RETORNA
				{
				mRETORNA(); 

				}
				break;
			case 53 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:435: FALSO
				{
				mFALSO(); 

				}
				break;
			case 54 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:441: FIN_SI
				{
				mFIN_SI(); 

				}
				break;
			case 55 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:448: FIN_PARA
				{
				mFIN_PARA(); 

				}
				break;
			case 56 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:457: FIN_MIENTRAS
				{
				mFIN_MIENTRAS(); 

				}
				break;
			case 57 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:470: NO
				{
				mNO(); 

				}
				break;
			case 58 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:473: MENOR
				{
				mMENOR(); 

				}
				break;
			case 59 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:479: QUE
				{
				mQUE(); 

				}
				break;
			case 60 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:483: IGUAL
				{
				mIGUAL(); 

				}
				break;
			case 61 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:489: DIFERENTE
				{
				mDIFERENTE(); 

				}
				break;
			case 62 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:499: ES
				{
				mES(); 

				}
				break;
			case 63 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:502: A
				{
				mA(); 

				}
				break;
			case 64 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:504: EN
				{
				mEN(); 

				}
				break;
			case 65 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:507: RANGO
				{
				mRANGO(); 

				}
				break;
			case 66 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:513: DECLA
				{
				mDECLA(); 

				}
				break;
			case 67 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:519: SUMA
				{
				mSUMA(); 

				}
				break;
			case 68 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:524: RESTA
				{
				mRESTA(); 

				}
				break;
			case 69 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:530: MULTIPLICACION
				{
				mMULTIPLICACION(); 

				}
				break;
			case 70 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:545: DIVISION
				{
				mDIVISION(); 

				}
				break;
			case 71 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:554: MODULO
				{
				mMODULO(); 

				}
				break;
			case 72 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:561: IGUAL_QUE
				{
				mIGUAL_QUE(); 

				}
				break;
			case 73 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:571: MAYOR_QUE
				{
				mMAYOR_QUE(); 

				}
				break;
			case 74 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:581: MENOR_QUE
				{
				mMENOR_QUE(); 

				}
				break;
			case 75 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:591: MAYOR_O_IGUAL_QUE
				{
				mMAYOR_O_IGUAL_QUE(); 

				}
				break;
			case 76 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:609: MENOR_O_IGUAL_QUE
				{
				mMENOR_O_IGUAL_QUE(); 

				}
				break;
			case 77 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:627: DESIGUALDAD
				{
				mDESIGUALDAD(); 

				}
				break;
			case 78 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:639: CONJUNCION
				{
				mCONJUNCION(); 

				}
				break;
			case 79 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:650: DISYUNCION
				{
				mDISYUNCION(); 

				}
				break;
			case 80 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:661: ID
				{
				mID(); 

				}
				break;
			case 81 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:664: INT
				{
				mINT(); 

				}
				break;
			case 82 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:668: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 83 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:674: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 84 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:682: WS
				{
				mWS(); 

				}
				break;
			case 85 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:685: STRING
				{
				mSTRING(); 

				}
				break;
			case 86 :
				// E:\\Documentos\\to explode\\LenguajeUTB.g:1:692: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA18 dfa18 = new DFA18(this);
	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "326:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA18_eotS =
		"\13\uffff\1\70\1\72\23\uffff\1\112\4\uffff\1\116\4\uffff\1\124\1\uffff"+
		"\1\126\27\uffff\1\145\4\uffff\1\147\52\uffff\1\u0083\1\u0085\1\uffff\1"+
		"\u0088\2\uffff\1\u008a\6\uffff\1\u008d\22\uffff\1\u0096\2\uffff";
	static final String DFA18_eofS =
		"\u0097\uffff";
	static final String DFA18_minS =
		"\1\11\3\uffff\1\157\1\141\1\156\4\141\1\147\1\160\3\uffff\1\141\1\147"+
		"\2\141\2\145\1\uffff\1\151\10\uffff\1\56\4\uffff\1\137\2\uffff\1\164\1"+
		"\156\1\137\1\uffff\1\143\3\uffff\1\154\1\uffff\2\155\1\uffff\1\162\5\uffff"+
		"\1\143\1\uffff\1\165\1\156\3\uffff\1\141\1\uffff\1\143\4\uffff\1\156\1"+
		"\uffff\1\142\4\uffff\2\157\1\145\1\154\3\uffff\1\157\5\uffff\1\141\2\uffff"+
		"\1\141\1\137\1\uffff\1\157\4\uffff\3\162\2\uffff\1\141\1\162\1\137\1\154"+
		"\1\146\1\162\1\145\4\137\2\uffff\1\137\5\uffff\1\156\1\137\1\157\1\uffff"+
		"\1\157\1\uffff\1\143\4\uffff\1\141\10\uffff\1\162\2\uffff";
	static final String DFA18_maxS =
		"\1\171\3\uffff\2\157\1\170\1\151\1\145\2\157\1\162\1\160\3\uffff\1\141"+
		"\1\156\1\165\1\145\1\151\1\154\1\uffff\1\151\10\uffff\1\145\4\uffff\1"+
		"\164\2\uffff\1\171\1\156\1\164\1\uffff\1\143\3\uffff\1\162\1\uffff\1\162"+
		"\1\156\1\uffff\1\162\5\uffff\1\163\1\uffff\1\165\1\156\3\uffff\1\164\1"+
		"\uffff\1\143\4\uffff\1\156\1\uffff\1\142\4\uffff\3\157\1\154\3\uffff\1"+
		"\157\5\uffff\1\141\2\uffff\1\141\1\137\1\uffff\1\157\4\uffff\3\162\2\uffff"+
		"\1\141\1\162\1\155\1\154\1\166\1\162\1\145\4\137\2\uffff\1\137\5\uffff"+
		"\1\156\1\137\1\161\1\uffff\1\161\1\uffff\1\160\4\uffff\1\141\10\uffff"+
		"\1\162\2\uffff";
	static final String DFA18_acceptS =
		"\1\uffff\1\1\1\2\1\3\11\uffff\1\25\1\26\1\27\6\uffff\1\45\1\uffff\1\73"+
		"\1\103\1\104\1\105\1\106\1\107\1\116\1\120\1\uffff\1\122\1\124\1\125\1"+
		"\126\1\uffff\1\5\1\40\3\uffff\1\23\1\uffff\1\10\1\11\1\33\1\uffff\1\63"+
		"\2\uffff\1\16\1\uffff\1\20\1\35\1\77\1\24\1\117\1\uffff\1\34\2\uffff\1"+
		"\44\1\46\1\65\1\uffff\1\101\1\uffff\1\75\1\43\1\47\1\57\1\uffff\1\121"+
		"\1\uffff\1\115\1\123\1\71\1\42\4\uffff\1\100\1\52\1\76\1\uffff\1\32\1"+
		"\14\1\50\1\17\1\54\1\uffff\1\30\1\61\2\uffff\1\37\1\uffff\1\102\1\41\1"+
		"\62\1\60\3\uffff\1\6\1\13\13\uffff\1\31\1\55\1\uffff\1\36\1\53\1\66\1"+
		"\67\1\70\3\uffff\1\51\1\uffff\1\72\1\uffff\1\12\1\15\1\110\1\74\1\uffff"+
		"\1\4\1\7\1\111\1\113\1\112\1\114\1\21\1\22\1\uffff\1\56\1\64";
	static final String DFA18_specialS =
		"\u0097\uffff}>";
	static final String[] DFA18_transitionS = {
			"\2\42\2\uffff\1\42\22\uffff\1\42\1\uffff\1\43\1\uffff\1\37\1\35\1\uffff"+
			"\1\44\1\15\1\16\1\33\1\31\1\17\1\32\1\41\1\34\12\40\1\1\1\uffff\1\2\44"+
			"\uffff\1\13\1\26\1\11\1\24\1\6\1\22\1\uffff\1\20\1\21\2\uffff\1\25\1"+
			"\5\1\4\1\14\1\12\1\30\1\23\1\27\1\7\1\uffff\1\10\1\uffff\1\3\1\36",
			"",
			"",
			"",
			"\1\45",
			"\1\50\3\uffff\1\51\3\uffff\1\47\5\uffff\1\46",
			"\1\52\4\uffff\1\54\4\uffff\1\53",
			"\1\56\3\uffff\1\57\3\uffff\1\55",
			"\1\60\3\uffff\1\61",
			"\1\62\15\uffff\1\63",
			"\1\65\15\uffff\1\64",
			"\1\66\12\uffff\1\67",
			"\1\71",
			"",
			"",
			"",
			"\1\73",
			"\1\75\6\uffff\1\74",
			"\1\101\7\uffff\1\76\2\uffff\1\77\10\uffff\1\100",
			"\1\103\3\uffff\1\102",
			"\1\104\3\uffff\1\105",
			"\1\110\3\uffff\1\106\2\uffff\1\107",
			"",
			"\1\111",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\41\1\uffff\12\40\13\uffff\1\41\37\uffff\1\41",
			"",
			"",
			"",
			"",
			"\1\114\15\uffff\1\113\6\uffff\1\115",
			"",
			"",
			"\1\117\4\uffff\1\120",
			"\1\121",
			"\1\123\24\uffff\1\122",
			"",
			"\1\125",
			"",
			"",
			"",
			"\1\127\5\uffff\1\130",
			"",
			"\1\131\4\uffff\1\132",
			"\1\134\1\133",
			"",
			"\1\135",
			"",
			"",
			"",
			"",
			"",
			"\1\136\17\uffff\1\137",
			"",
			"\1\140",
			"\1\141",
			"",
			"",
			"",
			"\1\142\22\uffff\1\143",
			"",
			"\1\144",
			"",
			"",
			"",
			"",
			"\1\146",
			"",
			"\1\150",
			"",
			"",
			"",
			"",
			"\1\151",
			"\1\152",
			"\1\153\11\uffff\1\154",
			"\1\155",
			"",
			"",
			"",
			"\1\156",
			"",
			"",
			"",
			"",
			"",
			"\1\157",
			"",
			"",
			"\1\160",
			"\1\161",
			"",
			"\1\162",
			"",
			"",
			"",
			"",
			"\1\163",
			"\1\164",
			"\1\165",
			"",
			"",
			"\1\166",
			"\1\167",
			"\1\171\15\uffff\1\170",
			"\1\172",
			"\1\174\6\uffff\1\177\2\uffff\1\176\2\uffff\1\175\2\uffff\1\173",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0084",
			"\1\u0086",
			"\1\u0087",
			"",
			"",
			"\1\u0089",
			"",
			"",
			"",
			"",
			"",
			"\1\u008b",
			"\1\u008c",
			"\1\u008f\1\uffff\1\u008e",
			"",
			"\1\u0091\1\uffff\1\u0090",
			"",
			"\1\u0093\14\uffff\1\u0092",
			"",
			"",
			"",
			"",
			"\1\u0094",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0095",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__92 | T__93 | T__94 | NOMBRE_DEL_EJERCICIO | MOSTRAR | ENTERO | NOMBRE | TIPO | TAMANO | VALOR_INICIAL | ENTONCES | CAMBIAR | VALOR | POR | CONVERTIR | AGREGAR | POSICION | COORDENADA | EXPRESIONES | OP_LISTAS | PARENTECIS_ABRE | PARENTECIS_CIERRA | COMA | HACER | PARAMETROS | VARIABLES | TEXTO | INICIO | ARREGLO | FIN_VARIABLES | REAL | MIENTRAS | DE | MATRIZ | LISTA | FLUJO | BOOLEANO | FUNCION | LLAMAR | CARACTER | MAYOR | ESCRIBIR | FIN_FLUJO | COMO | PARA | RETORNAR | LEER | SI | HASTA | SINO | VERDADERO | RETORNA | FALSO | FIN_SI | FIN_PARA | FIN_MIENTRAS | NO | MENOR | QUE | IGUAL | DIFERENTE | ES | A | EN | RANGO | DECLA | SUMA | RESTA | MULTIPLICACION | DIVISION | MODULO | IGUAL_QUE | MAYOR_QUE | MENOR_QUE | MAYOR_O_IGUAL_QUE | MENOR_O_IGUAL_QUE | DESIGUALDAD | CONJUNCION | DISYUNCION | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
	}

}
