// $ANTLR 3.5.1 E:\\Documentos\\to explode\\LenguajeUTB.g 2017-05-29 08:52:05

package co.edu.utb.softeng.springseedproject.controllers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class LenguajeUTBParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AGREGAR", "ARREGLO", "BOOLEANO", 
		"CAMBIAR", "CARACTER", "CHAR", "COMA", "COMMENT", "COMO", "CONJUNCION", 
		"CONVERTIR", "COORDENADA", "DE", "DECLA", "DESIGUALDAD", "DIFERENTE", 
		"DISYUNCION", "DIVISION", "EN", "ENTERO", "ENTONCES", "ES", "ESCRIBIR", 
		"ESC_SEQ", "EXPONENT", "EXPRESIONES", "FALSO", "FIN_FLUJO", "FIN_MIENTRAS", 
		"FIN_PARA", "FIN_SI", "FIN_VARIABLES", "FLOAT", "FLUJO", "FUNCION", "HACER", 
		"HASTA", "HEX_DIGIT", "ID", "IGUAL", "IGUAL_QUE", "INICIO", "INT", "LEER", 
		"LISTA", "LLAMAR", "MATRIZ", "MAYOR", "MAYOR_O_IGUAL_QUE", "MAYOR_QUE", 
		"MENOR", "MENOR_O_IGUAL_QUE", "MENOR_QUE", "MIENTRAS", "MODULO", "MOSTRAR", 
		"MULTIPLICACION", "NO", "NOMBRE", "NOMBRE_DEL_EJERCICIO", "OCTAL_ESC", 
		"OP_LISTAS", "PARA", "PARAMETROS", "PARENTECIS_ABRE", "PARENTECIS_CIERRA", 
		"POR", "POSICION", "QUE", "RANGO", "REAL", "RESTA", "RETORNA", "RETORNAR", 
		"SI", "SINO", "STRING", "SUMA", "TAMANO", "TEXTO", "TIPO", "UNICODE_ESC", 
		"VALOR", "VALOR_INICIAL", "VARIABLES", "VERDADERO", "WS", "':'", "'<-'", 
		"'x'"
	};
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LenguajeUTBParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LenguajeUTBParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return LenguajeUTBParser.tokenNames; }
	@Override public String getGrammarFileName() { return "E:\\Documentos\\to explode\\LenguajeUTB.g"; }



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


	public static class estructura_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "estructura"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:144:1: estructura : ( titulo_programa ( variables )? flujo ) ;
	public final LenguajeUTBParser.estructura_return estructura() throws RecognitionException {
		LenguajeUTBParser.estructura_return retval = new LenguajeUTBParser.estructura_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope titulo_programa1 =null;
		ParserRuleReturnScope variables2 =null;
		ParserRuleReturnScope flujo3 =null;


		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:144:11: ( ( titulo_programa ( variables )? flujo ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:144:15: ( titulo_programa ( variables )? flujo )
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTB.g:144:15: ( titulo_programa ( variables )? flujo )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:144:16: titulo_programa ( variables )? flujo
			{
			pushFollow(FOLLOW_titulo_programa_in_estructura53);
			titulo_programa1=titulo_programa();
			state._fsp--;

			adaptor.addChild(root_0, titulo_programa1.getTree());

			System.out.println((titulo_programa1!=null?((CommonTree)titulo_programa1.getTree()):null).toStringTree());
			// E:\\Documentos\\to explode\\LenguajeUTB.g:145:5: ( variables )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==VARIABLES) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:145:6: variables
					{
					pushFollow(FOLLOW_variables_in_estructura62);
					variables2=variables();
					state._fsp--;

					adaptor.addChild(root_0, variables2.getTree());

					System.out.println((variables2!=null?((CommonTree)variables2.getTree()):null).toStringTree());
					}
					break;

			}

			pushFollow(FOLLOW_flujo_in_estructura73);
			flujo3=flujo();
			state._fsp--;

			adaptor.addChild(root_0, flujo3.getTree());

			System.out.println((flujo3!=null?((CommonTree)flujo3.getTree()):null).toStringTree());
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "estructura"


	public static class titulo_programa_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "titulo_programa"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:148:1: titulo_programa : NOMBRE_DEL_EJERCICIO ^ ID ;
	public final LenguajeUTBParser.titulo_programa_return titulo_programa() throws RecognitionException {
		LenguajeUTBParser.titulo_programa_return retval = new LenguajeUTBParser.titulo_programa_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NOMBRE_DEL_EJERCICIO4=null;
		Token ID5=null;

		CommonTree NOMBRE_DEL_EJERCICIO4_tree=null;
		CommonTree ID5_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:148:16: ( NOMBRE_DEL_EJERCICIO ^ ID )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:148:19: NOMBRE_DEL_EJERCICIO ^ ID
			{
			root_0 = (CommonTree)adaptor.nil();


			NOMBRE_DEL_EJERCICIO4=(Token)match(input,NOMBRE_DEL_EJERCICIO,FOLLOW_NOMBRE_DEL_EJERCICIO_in_titulo_programa83); 
			NOMBRE_DEL_EJERCICIO4_tree = (CommonTree)adaptor.create(NOMBRE_DEL_EJERCICIO4);
			root_0 = (CommonTree)adaptor.becomeRoot(NOMBRE_DEL_EJERCICIO4_tree, root_0);

			ID5=(Token)match(input,ID,FOLLOW_ID_in_titulo_programa87); 
			ID5_tree = (CommonTree)adaptor.create(ID5);
			adaptor.addChild(root_0, ID5_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "titulo_programa"


	public static class variables_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variables"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:150:1: variables : VARIABLES ( declaracion )+ FIN_VARIABLES -> ^( VARIABLES ( declaracion )+ ) ;
	public final LenguajeUTBParser.variables_return variables() throws RecognitionException {
		LenguajeUTBParser.variables_return retval = new LenguajeUTBParser.variables_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token VARIABLES6=null;
		Token FIN_VARIABLES8=null;
		ParserRuleReturnScope declaracion7 =null;

		CommonTree VARIABLES6_tree=null;
		CommonTree FIN_VARIABLES8_tree=null;
		RewriteRuleTokenStream stream_VARIABLES=new RewriteRuleTokenStream(adaptor,"token VARIABLES");
		RewriteRuleTokenStream stream_FIN_VARIABLES=new RewriteRuleTokenStream(adaptor,"token FIN_VARIABLES");
		RewriteRuleSubtreeStream stream_declaracion=new RewriteRuleSubtreeStream(adaptor,"rule declaracion");

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:150:10: ( VARIABLES ( declaracion )+ FIN_VARIABLES -> ^( VARIABLES ( declaracion )+ ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:150:12: VARIABLES ( declaracion )+ FIN_VARIABLES
			{
			VARIABLES6=(Token)match(input,VARIABLES,FOLLOW_VARIABLES_in_variables95);  
			stream_VARIABLES.add(VARIABLES6);

			// E:\\Documentos\\to explode\\LenguajeUTB.g:150:22: ( declaracion )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==TIPO) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:150:23: declaracion
					{
					pushFollow(FOLLOW_declaracion_in_variables98);
					declaracion7=declaracion();
					state._fsp--;

					stream_declaracion.add(declaracion7.getTree());
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			FIN_VARIABLES8=(Token)match(input,FIN_VARIABLES,FOLLOW_FIN_VARIABLES_in_variables102);  
			stream_FIN_VARIABLES.add(FIN_VARIABLES8);

			// AST REWRITE
			// elements: declaracion, VARIABLES
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 150:50: -> ^( VARIABLES ( declaracion )+ )
			{
				// E:\\Documentos\\to explode\\LenguajeUTB.g:150:52: ^( VARIABLES ( declaracion )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_VARIABLES.nextNode(), root_1);
				if ( !(stream_declaracion.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_declaracion.hasNext() ) {
					adaptor.addChild(root_1, stream_declaracion.nextTree());
				}
				stream_declaracion.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variables"


	public static class flujo_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "flujo"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:153:1: flujo : FLUJO ( sentencia )* FIN_FLUJO -> ^( FLUJO ( sentencia )* ) ;
	public final LenguajeUTBParser.flujo_return flujo() throws RecognitionException {
		LenguajeUTBParser.flujo_return retval = new LenguajeUTBParser.flujo_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FLUJO9=null;
		Token FIN_FLUJO11=null;
		ParserRuleReturnScope sentencia10 =null;

		CommonTree FLUJO9_tree=null;
		CommonTree FIN_FLUJO11_tree=null;
		RewriteRuleTokenStream stream_FLUJO=new RewriteRuleTokenStream(adaptor,"token FLUJO");
		RewriteRuleTokenStream stream_FIN_FLUJO=new RewriteRuleTokenStream(adaptor,"token FIN_FLUJO");
		RewriteRuleSubtreeStream stream_sentencia=new RewriteRuleSubtreeStream(adaptor,"rule sentencia");

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:153:7: ( FLUJO ( sentencia )* FIN_FLUJO -> ^( FLUJO ( sentencia )* ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:153:9: FLUJO ( sentencia )* FIN_FLUJO
			{
			FLUJO9=(Token)match(input,FLUJO,FOLLOW_FLUJO_in_flujo120);  
			stream_FLUJO.add(FLUJO9);

			// E:\\Documentos\\to explode\\LenguajeUTB.g:153:15: ( sentencia )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==AGREGAR||LA3_0==CAMBIAR||LA3_0==ESCRIBIR||LA3_0==ID||LA3_0==MIENTRAS||LA3_0==MOSTRAR||LA3_0==PARA||LA3_0==SI) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:153:16: sentencia
					{
					pushFollow(FOLLOW_sentencia_in_flujo123);
					sentencia10=sentencia();
					state._fsp--;

					stream_sentencia.add(sentencia10.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			FIN_FLUJO11=(Token)match(input,FIN_FLUJO,FOLLOW_FIN_FLUJO_in_flujo127);  
			stream_FIN_FLUJO.add(FIN_FLUJO11);

			// AST REWRITE
			// elements: FLUJO, sentencia
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 153:37: -> ^( FLUJO ( sentencia )* )
			{
				// E:\\Documentos\\to explode\\LenguajeUTB.g:153:39: ^( FLUJO ( sentencia )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_FLUJO.nextNode(), root_1);
				// E:\\Documentos\\to explode\\LenguajeUTB.g:153:47: ( sentencia )*
				while ( stream_sentencia.hasNext() ) {
					adaptor.addChild(root_1, stream_sentencia.nextTree());
				}
				stream_sentencia.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "flujo"


	public static class declaracion_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaracion"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:155:1: declaracion : op_decl -> ^( DECLA op_decl ) ;
	public final LenguajeUTBParser.declaracion_return declaracion() throws RecognitionException {
		LenguajeUTBParser.declaracion_return retval = new LenguajeUTBParser.declaracion_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope op_decl12 =null;

		RewriteRuleSubtreeStream stream_op_decl=new RewriteRuleSubtreeStream(adaptor,"rule op_decl");

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:155:12: ( op_decl -> ^( DECLA op_decl ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:155:17: op_decl
			{
			pushFollow(FOLLOW_op_decl_in_declaracion146);
			op_decl12=op_decl();
			state._fsp--;

			stream_op_decl.add(op_decl12.getTree());
			// AST REWRITE
			// elements: op_decl
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 155:24: -> ^( DECLA op_decl )
			{
				// E:\\Documentos\\to explode\\LenguajeUTB.g:155:26: ^( DECLA op_decl )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLA, "DECLA"), root_1);
				adaptor.addChild(root_1, stream_op_decl.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaracion"


	public static class op_decl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "op_decl"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:157:1: op_decl : ( ( ( TIPO ^ var DE ! NOMBRE ! ID ) ( valor_inicial )? ) | listas | matriz );
	public final LenguajeUTBParser.op_decl_return op_decl() throws RecognitionException {
		LenguajeUTBParser.op_decl_return retval = new LenguajeUTBParser.op_decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TIPO13=null;
		Token DE15=null;
		Token NOMBRE16=null;
		Token ID17=null;
		ParserRuleReturnScope var14 =null;
		ParserRuleReturnScope valor_inicial18 =null;
		ParserRuleReturnScope listas19 =null;
		ParserRuleReturnScope matriz20 =null;

		CommonTree TIPO13_tree=null;
		CommonTree DE15_tree=null;
		CommonTree NOMBRE16_tree=null;
		CommonTree ID17_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:157:9: ( ( ( TIPO ^ var DE ! NOMBRE ! ID ) ( valor_inicial )? ) | listas | matriz )
			int alt5=3;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==TIPO) ) {
				switch ( input.LA(2) ) {
				case LISTA:
					{
					alt5=2;
					}
					break;
				case MATRIZ:
					{
					alt5=3;
					}
					break;
				case BOOLEANO:
				case ENTERO:
				case REAL:
				case TEXTO:
					{
					alt5=1;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:157:11: ( ( TIPO ^ var DE ! NOMBRE ! ID ) ( valor_inicial )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					// E:\\Documentos\\to explode\\LenguajeUTB.g:157:11: ( ( TIPO ^ var DE ! NOMBRE ! ID ) ( valor_inicial )? )
					// E:\\Documentos\\to explode\\LenguajeUTB.g:157:12: ( TIPO ^ var DE ! NOMBRE ! ID ) ( valor_inicial )?
					{
					// E:\\Documentos\\to explode\\LenguajeUTB.g:157:12: ( TIPO ^ var DE ! NOMBRE ! ID )
					// E:\\Documentos\\to explode\\LenguajeUTB.g:157:13: TIPO ^ var DE ! NOMBRE ! ID
					{
					TIPO13=(Token)match(input,TIPO,FOLLOW_TIPO_in_op_decl162); 
					TIPO13_tree = (CommonTree)adaptor.create(TIPO13);
					root_0 = (CommonTree)adaptor.becomeRoot(TIPO13_tree, root_0);

					pushFollow(FOLLOW_var_in_op_decl165);
					var14=var();
					state._fsp--;

					adaptor.addChild(root_0, var14.getTree());

					DE15=(Token)match(input,DE,FOLLOW_DE_in_op_decl167); 
					NOMBRE16=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_op_decl170); 
					ID17=(Token)match(input,ID,FOLLOW_ID_in_op_decl173); 
					ID17_tree = (CommonTree)adaptor.create(ID17);
					adaptor.addChild(root_0, ID17_tree);

					}

					// E:\\Documentos\\to explode\\LenguajeUTB.g:157:38: ( valor_inicial )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==VALOR_INICIAL) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:157:39: valor_inicial
							{
							pushFollow(FOLLOW_valor_inicial_in_op_decl176);
							valor_inicial18=valor_inicial();
							state._fsp--;

							adaptor.addChild(root_0, valor_inicial18.getTree());

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:157:56: listas
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_listas_in_op_decl181);
					listas19=listas();
					state._fsp--;

					adaptor.addChild(root_0, listas19.getTree());

					}
					break;
				case 3 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:158:4: matriz
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_matriz_in_op_decl186);
					matriz20=matriz();
					state._fsp--;

					adaptor.addChild(root_0, matriz20.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "op_decl"


	public static class valor_inicial_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "valor_inicial"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:162:1: valor_inicial : VALOR_INICIAL ^ ( INT | STRING | FLOAT | ( FALSO | VERDADERO ) ) ;
	public final LenguajeUTBParser.valor_inicial_return valor_inicial() throws RecognitionException {
		LenguajeUTBParser.valor_inicial_return retval = new LenguajeUTBParser.valor_inicial_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token VALOR_INICIAL21=null;
		Token set22=null;

		CommonTree VALOR_INICIAL21_tree=null;
		CommonTree set22_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:162:14: ( VALOR_INICIAL ^ ( INT | STRING | FLOAT | ( FALSO | VERDADERO ) ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:162:17: VALOR_INICIAL ^ ( INT | STRING | FLOAT | ( FALSO | VERDADERO ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			VALOR_INICIAL21=(Token)match(input,VALOR_INICIAL,FOLLOW_VALOR_INICIAL_in_valor_inicial198); 
			VALOR_INICIAL21_tree = (CommonTree)adaptor.create(VALOR_INICIAL21);
			root_0 = (CommonTree)adaptor.becomeRoot(VALOR_INICIAL21_tree, root_0);

			set22=input.LT(1);
			if ( input.LA(1)==FALSO||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==STRING||input.LA(1)==VERDADERO ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set22));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valor_inicial"


	public static class var_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "var"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:164:1: var : ( ENTERO | TEXTO | REAL | BOOLEANO ) ;
	public final LenguajeUTBParser.var_return var() throws RecognitionException {
		LenguajeUTBParser.var_return retval = new LenguajeUTBParser.var_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set23=null;

		CommonTree set23_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:164:5: ( ( ENTERO | TEXTO | REAL | BOOLEANO ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set23=input.LT(1);
			if ( input.LA(1)==BOOLEANO||input.LA(1)==ENTERO||input.LA(1)==REAL||input.LA(1)==TEXTO ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set23));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var"


	public static class listas_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "listas"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:166:1: listas : TIPO ! LISTA ^ DE ! var NOMBRE ! ID ;
	public final LenguajeUTBParser.listas_return listas() throws RecognitionException {
		LenguajeUTBParser.listas_return retval = new LenguajeUTBParser.listas_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TIPO24=null;
		Token LISTA25=null;
		Token DE26=null;
		Token NOMBRE28=null;
		Token ID29=null;
		ParserRuleReturnScope var27 =null;

		CommonTree TIPO24_tree=null;
		CommonTree LISTA25_tree=null;
		CommonTree DE26_tree=null;
		CommonTree NOMBRE28_tree=null;
		CommonTree ID29_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:166:8: ( TIPO ! LISTA ^ DE ! var NOMBRE ! ID )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:166:10: TIPO ! LISTA ^ DE ! var NOMBRE ! ID
			{
			root_0 = (CommonTree)adaptor.nil();


			TIPO24=(Token)match(input,TIPO,FOLLOW_TIPO_in_listas238); 
			LISTA25=(Token)match(input,LISTA,FOLLOW_LISTA_in_listas241); 
			LISTA25_tree = (CommonTree)adaptor.create(LISTA25);
			root_0 = (CommonTree)adaptor.becomeRoot(LISTA25_tree, root_0);

			DE26=(Token)match(input,DE,FOLLOW_DE_in_listas244); 
			pushFollow(FOLLOW_var_in_listas247);
			var27=var();
			state._fsp--;

			adaptor.addChild(root_0, var27.getTree());

			NOMBRE28=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_listas249); 
			ID29=(Token)match(input,ID,FOLLOW_ID_in_listas252); 
			ID29_tree = (CommonTree)adaptor.create(ID29);
			adaptor.addChild(root_0, ID29_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "listas"


	public static class matriz_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "matriz"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:168:1: matriz : TIPO ! MATRIZ ^ DE ! var NOMBRE ! ID DE ! TAMANO ! ( INT 'x' ! INT ) ;
	public final LenguajeUTBParser.matriz_return matriz() throws RecognitionException {
		LenguajeUTBParser.matriz_return retval = new LenguajeUTBParser.matriz_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TIPO30=null;
		Token MATRIZ31=null;
		Token DE32=null;
		Token NOMBRE34=null;
		Token ID35=null;
		Token DE36=null;
		Token TAMANO37=null;
		Token INT38=null;
		Token char_literal39=null;
		Token INT40=null;
		ParserRuleReturnScope var33 =null;

		CommonTree TIPO30_tree=null;
		CommonTree MATRIZ31_tree=null;
		CommonTree DE32_tree=null;
		CommonTree NOMBRE34_tree=null;
		CommonTree ID35_tree=null;
		CommonTree DE36_tree=null;
		CommonTree TAMANO37_tree=null;
		CommonTree INT38_tree=null;
		CommonTree char_literal39_tree=null;
		CommonTree INT40_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:168:8: ( TIPO ! MATRIZ ^ DE ! var NOMBRE ! ID DE ! TAMANO ! ( INT 'x' ! INT ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:168:10: TIPO ! MATRIZ ^ DE ! var NOMBRE ! ID DE ! TAMANO ! ( INT 'x' ! INT )
			{
			root_0 = (CommonTree)adaptor.nil();


			TIPO30=(Token)match(input,TIPO,FOLLOW_TIPO_in_matriz260); 
			MATRIZ31=(Token)match(input,MATRIZ,FOLLOW_MATRIZ_in_matriz263); 
			MATRIZ31_tree = (CommonTree)adaptor.create(MATRIZ31);
			root_0 = (CommonTree)adaptor.becomeRoot(MATRIZ31_tree, root_0);

			DE32=(Token)match(input,DE,FOLLOW_DE_in_matriz266); 
			pushFollow(FOLLOW_var_in_matriz269);
			var33=var();
			state._fsp--;

			adaptor.addChild(root_0, var33.getTree());

			NOMBRE34=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_matriz271); 
			ID35=(Token)match(input,ID,FOLLOW_ID_in_matriz274); 
			ID35_tree = (CommonTree)adaptor.create(ID35);
			adaptor.addChild(root_0, ID35_tree);

			DE36=(Token)match(input,DE,FOLLOW_DE_in_matriz276); 
			TAMANO37=(Token)match(input,TAMANO,FOLLOW_TAMANO_in_matriz279); 
			// E:\\Documentos\\to explode\\LenguajeUTB.g:168:55: ( INT 'x' ! INT )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:168:56: INT 'x' ! INT
			{
			INT38=(Token)match(input,INT,FOLLOW_INT_in_matriz283); 
			INT38_tree = (CommonTree)adaptor.create(INT38);
			adaptor.addChild(root_0, INT38_tree);

			char_literal39=(Token)match(input,94,FOLLOW_94_in_matriz285); 
			INT40=(Token)match(input,INT,FOLLOW_INT_in_matriz288); 
			INT40_tree = (CommonTree)adaptor.create(INT40);
			adaptor.addChild(root_0, INT40_tree);

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "matriz"


	public static class conversion_implicita_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conversion_implicita"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:170:1: conversion_implicita : CAMBIAR ! VALOR ^ DE ! ID POR ! ID ;
	public final LenguajeUTBParser.conversion_implicita_return conversion_implicita() throws RecognitionException {
		LenguajeUTBParser.conversion_implicita_return retval = new LenguajeUTBParser.conversion_implicita_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CAMBIAR41=null;
		Token VALOR42=null;
		Token DE43=null;
		Token ID44=null;
		Token POR45=null;
		Token ID46=null;

		CommonTree CAMBIAR41_tree=null;
		CommonTree VALOR42_tree=null;
		CommonTree DE43_tree=null;
		CommonTree ID44_tree=null;
		CommonTree POR45_tree=null;
		CommonTree ID46_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:170:21: ( CAMBIAR ! VALOR ^ DE ! ID POR ! ID )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:170:23: CAMBIAR ! VALOR ^ DE ! ID POR ! ID
			{
			root_0 = (CommonTree)adaptor.nil();


			CAMBIAR41=(Token)match(input,CAMBIAR,FOLLOW_CAMBIAR_in_conversion_implicita296); 
			VALOR42=(Token)match(input,VALOR,FOLLOW_VALOR_in_conversion_implicita299); 
			VALOR42_tree = (CommonTree)adaptor.create(VALOR42);
			root_0 = (CommonTree)adaptor.becomeRoot(VALOR42_tree, root_0);

			DE43=(Token)match(input,DE,FOLLOW_DE_in_conversion_implicita302); 
			ID44=(Token)match(input,ID,FOLLOW_ID_in_conversion_implicita305); 
			ID44_tree = (CommonTree)adaptor.create(ID44);
			adaptor.addChild(root_0, ID44_tree);

			POR45=(Token)match(input,POR,FOLLOW_POR_in_conversion_implicita307); 
			ID46=(Token)match(input,ID,FOLLOW_ID_in_conversion_implicita310); 
			ID46_tree = (CommonTree)adaptor.create(ID46);
			adaptor.addChild(root_0, ID46_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conversion_implicita"


	public static class conversion_explicita_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conversion_explicita"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:171:1: conversion_explicita : CAMBIAR ! VALOR ^ DE ! ID POR ! CONVERTIR ! ID A ! var ;
	public final LenguajeUTBParser.conversion_explicita_return conversion_explicita() throws RecognitionException {
		LenguajeUTBParser.conversion_explicita_return retval = new LenguajeUTBParser.conversion_explicita_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CAMBIAR47=null;
		Token VALOR48=null;
		Token DE49=null;
		Token ID50=null;
		Token POR51=null;
		Token CONVERTIR52=null;
		Token ID53=null;
		Token A54=null;
		ParserRuleReturnScope var55 =null;

		CommonTree CAMBIAR47_tree=null;
		CommonTree VALOR48_tree=null;
		CommonTree DE49_tree=null;
		CommonTree ID50_tree=null;
		CommonTree POR51_tree=null;
		CommonTree CONVERTIR52_tree=null;
		CommonTree ID53_tree=null;
		CommonTree A54_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:171:21: ( CAMBIAR ! VALOR ^ DE ! ID POR ! CONVERTIR ! ID A ! var )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:171:23: CAMBIAR ! VALOR ^ DE ! ID POR ! CONVERTIR ! ID A ! var
			{
			root_0 = (CommonTree)adaptor.nil();


			CAMBIAR47=(Token)match(input,CAMBIAR,FOLLOW_CAMBIAR_in_conversion_explicita317); 
			VALOR48=(Token)match(input,VALOR,FOLLOW_VALOR_in_conversion_explicita320); 
			VALOR48_tree = (CommonTree)adaptor.create(VALOR48);
			root_0 = (CommonTree)adaptor.becomeRoot(VALOR48_tree, root_0);

			DE49=(Token)match(input,DE,FOLLOW_DE_in_conversion_explicita323); 
			ID50=(Token)match(input,ID,FOLLOW_ID_in_conversion_explicita326); 
			ID50_tree = (CommonTree)adaptor.create(ID50);
			adaptor.addChild(root_0, ID50_tree);

			POR51=(Token)match(input,POR,FOLLOW_POR_in_conversion_explicita328); 
			CONVERTIR52=(Token)match(input,CONVERTIR,FOLLOW_CONVERTIR_in_conversion_explicita331); 
			ID53=(Token)match(input,ID,FOLLOW_ID_in_conversion_explicita334); 
			ID53_tree = (CommonTree)adaptor.create(ID53);
			adaptor.addChild(root_0, ID53_tree);

			A54=(Token)match(input,A,FOLLOW_A_in_conversion_explicita336); 
			pushFollow(FOLLOW_var_in_conversion_explicita339);
			var55=var();
			state._fsp--;

			adaptor.addChild(root_0, var55.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conversion_explicita"


	public static class mostrar_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mostrar"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:173:1: mostrar : MOSTRAR ( valores ( COMA valores )* ( coor_pos )? ) -> ( ^( MOSTRAR ( valores )+ ( coor_pos )? ) )+ ;
	public final LenguajeUTBParser.mostrar_return mostrar() throws RecognitionException {
		LenguajeUTBParser.mostrar_return retval = new LenguajeUTBParser.mostrar_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MOSTRAR56=null;
		Token COMA58=null;
		ParserRuleReturnScope valores57 =null;
		ParserRuleReturnScope valores59 =null;
		ParserRuleReturnScope coor_pos60 =null;

		CommonTree MOSTRAR56_tree=null;
		CommonTree COMA58_tree=null;
		RewriteRuleTokenStream stream_MOSTRAR=new RewriteRuleTokenStream(adaptor,"token MOSTRAR");
		RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
		RewriteRuleSubtreeStream stream_coor_pos=new RewriteRuleSubtreeStream(adaptor,"rule coor_pos");
		RewriteRuleSubtreeStream stream_valores=new RewriteRuleSubtreeStream(adaptor,"rule valores");

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:173:8: ( MOSTRAR ( valores ( COMA valores )* ( coor_pos )? ) -> ( ^( MOSTRAR ( valores )+ ( coor_pos )? ) )+ )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:173:10: MOSTRAR ( valores ( COMA valores )* ( coor_pos )? )
			{
			MOSTRAR56=(Token)match(input,MOSTRAR,FOLLOW_MOSTRAR_in_mostrar347);  
			stream_MOSTRAR.add(MOSTRAR56);

			// E:\\Documentos\\to explode\\LenguajeUTB.g:173:19: ( valores ( COMA valores )* ( coor_pos )? )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:173:20: valores ( COMA valores )* ( coor_pos )?
			{
			pushFollow(FOLLOW_valores_in_mostrar351);
			valores57=valores();
			state._fsp--;

			stream_valores.add(valores57.getTree());
			// E:\\Documentos\\to explode\\LenguajeUTB.g:173:28: ( COMA valores )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:173:29: COMA valores
					{
					COMA58=(Token)match(input,COMA,FOLLOW_COMA_in_mostrar354);  
					stream_COMA.add(COMA58);

					pushFollow(FOLLOW_valores_in_mostrar356);
					valores59=valores();
					state._fsp--;

					stream_valores.add(valores59.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			// E:\\Documentos\\to explode\\LenguajeUTB.g:173:44: ( coor_pos )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==COORDENADA||LA7_0==POSICION) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:173:45: coor_pos
					{
					pushFollow(FOLLOW_coor_pos_in_mostrar361);
					coor_pos60=coor_pos();
					state._fsp--;

					stream_coor_pos.add(coor_pos60.getTree());
					}
					break;

			}

			}

			// AST REWRITE
			// elements: coor_pos, MOSTRAR, valores
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 173:56: -> ( ^( MOSTRAR ( valores )+ ( coor_pos )? ) )+
			{
				if ( !(stream_MOSTRAR.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_MOSTRAR.hasNext() ) {
					// E:\\Documentos\\to explode\\LenguajeUTB.g:173:58: ^( MOSTRAR ( valores )+ ( coor_pos )? )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					root_1 = (CommonTree)adaptor.becomeRoot(stream_MOSTRAR.nextNode(), root_1);
					if ( !(stream_valores.hasNext()) ) {
						throw new RewriteEarlyExitException();
					}
					while ( stream_valores.hasNext() ) {
						adaptor.addChild(root_1, stream_valores.nextTree());
					}
					stream_valores.reset();

					// E:\\Documentos\\to explode\\LenguajeUTB.g:173:77: ( coor_pos )?
					if ( stream_coor_pos.hasNext() ) {
						adaptor.addChild(root_1, stream_coor_pos.nextTree());
					}
					stream_coor_pos.reset();

					adaptor.addChild(root_0, root_1);
					}

				}
				stream_MOSTRAR.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mostrar"


	public static class valores_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "valores"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:175:1: valores : ( ID | STRING | INT | FLOAT | ( VERDADERO | FALSO ) ) ;
	public final LenguajeUTBParser.valores_return valores() throws RecognitionException {
		LenguajeUTBParser.valores_return retval = new LenguajeUTBParser.valores_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set61=null;

		CommonTree set61_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:175:9: ( ( ID | STRING | INT | FLOAT | ( VERDADERO | FALSO ) ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set61=input.LT(1);
			if ( input.LA(1)==FALSO||input.LA(1)==FLOAT||input.LA(1)==ID||input.LA(1)==INT||input.LA(1)==STRING||input.LA(1)==VERDADERO ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set61));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valores"


	public static class coor_pos_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "coor_pos"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:176:1: coor_pos : ( coor | pos ) ;
	public final LenguajeUTBParser.coor_pos_return coor_pos() throws RecognitionException {
		LenguajeUTBParser.coor_pos_return retval = new LenguajeUTBParser.coor_pos_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope coor62 =null;
		ParserRuleReturnScope pos63 =null;


		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:176:11: ( ( coor | pos ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:176:13: ( coor | pos )
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTB.g:176:13: ( coor | pos )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==COORDENADA) ) {
				alt8=1;
			}
			else if ( (LA8_0==POSICION) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:176:14: coor
					{
					pushFollow(FOLLOW_coor_in_coor_pos408);
					coor62=coor();
					state._fsp--;

					adaptor.addChild(root_0, coor62.getTree());

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:176:19: pos
					{
					pushFollow(FOLLOW_pos_in_coor_pos410);
					pos63=pos();
					state._fsp--;

					adaptor.addChild(root_0, pos63.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "coor_pos"


	public static class coor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "coor"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:177:1: coor : COORDENADA ^ coordenada ;
	public final LenguajeUTBParser.coor_return coor() throws RecognitionException {
		LenguajeUTBParser.coor_return retval = new LenguajeUTBParser.coor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COORDENADA64=null;
		ParserRuleReturnScope coordenada65 =null;

		CommonTree COORDENADA64_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:177:6: ( COORDENADA ^ coordenada )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:177:8: COORDENADA ^ coordenada
			{
			root_0 = (CommonTree)adaptor.nil();


			COORDENADA64=(Token)match(input,COORDENADA,FOLLOW_COORDENADA_in_coor419); 
			COORDENADA64_tree = (CommonTree)adaptor.create(COORDENADA64);
			root_0 = (CommonTree)adaptor.becomeRoot(COORDENADA64_tree, root_0);

			pushFollow(FOLLOW_coordenada_in_coor422);
			coordenada65=coordenada();
			state._fsp--;

			adaptor.addChild(root_0, coordenada65.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "coor"


	public static class pos_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "pos"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:178:1: pos : POSICION ^ ( INT | ID ) ;
	public final LenguajeUTBParser.pos_return pos() throws RecognitionException {
		LenguajeUTBParser.pos_return retval = new LenguajeUTBParser.pos_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token POSICION66=null;
		Token set67=null;

		CommonTree POSICION66_tree=null;
		CommonTree set67_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:178:5: ( POSICION ^ ( INT | ID ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:178:7: POSICION ^ ( INT | ID )
			{
			root_0 = (CommonTree)adaptor.nil();


			POSICION66=(Token)match(input,POSICION,FOLLOW_POSICION_in_pos429); 
			POSICION66_tree = (CommonTree)adaptor.create(POSICION66);
			root_0 = (CommonTree)adaptor.becomeRoot(POSICION66_tree, root_0);

			set67=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==INT ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set67));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pos"


	public static class operaciones_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operaciones"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:183:1: operaciones : ( operaciones_aritmeticas )* ;
	public final LenguajeUTBParser.operaciones_return operaciones() throws RecognitionException {
		LenguajeUTBParser.operaciones_return retval = new LenguajeUTBParser.operaciones_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope operaciones_aritmeticas68 =null;


		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:183:12: ( ( operaciones_aritmeticas )* )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:183:15: ( operaciones_aritmeticas )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTB.g:183:15: ( operaciones_aritmeticas )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==ID) ) {
					int LA9_2 = input.LA(2);
					if ( (LA9_2==AGREGAR||LA9_2==CAMBIAR||LA9_2==CONJUNCION||(LA9_2 >= DISYUNCION && LA9_2 <= DIVISION)||LA9_2==ENTONCES||LA9_2==ESCRIBIR||(LA9_2 >= FALSO && LA9_2 <= FIN_SI)||LA9_2==FLOAT||LA9_2==ID||LA9_2==IGUAL_QUE||LA9_2==INT||(LA9_2 >= MAYOR_O_IGUAL_QUE && LA9_2 <= MAYOR_QUE)||(LA9_2 >= MENOR_O_IGUAL_QUE && LA9_2 <= MULTIPLICACION)||LA9_2==PARA||LA9_2==PARENTECIS_ABRE||LA9_2==RESTA||(LA9_2 >= SI && LA9_2 <= SUMA)||LA9_2==VERDADERO||LA9_2==92) ) {
						alt9=1;
					}

				}
				else if ( (LA9_0==FALSO||LA9_0==FLOAT||LA9_0==INT||LA9_0==PARENTECIS_ABRE||LA9_0==STRING||LA9_0==VERDADERO) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:183:15: operaciones_aritmeticas
					{
					pushFollow(FOLLOW_operaciones_aritmeticas_in_operaciones447);
					operaciones_aritmeticas68=operaciones_aritmeticas();
					state._fsp--;

					adaptor.addChild(root_0, operaciones_aritmeticas68.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operaciones"


	public static class operaciones_aritmeticas_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operaciones_aritmeticas"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:184:1: operaciones_aritmeticas : multiplicacion ( ( SUMA ^| RESTA ^) multiplicacion )* ;
	public final LenguajeUTBParser.operaciones_aritmeticas_return operaciones_aritmeticas() throws RecognitionException {
		LenguajeUTBParser.operaciones_aritmeticas_return retval = new LenguajeUTBParser.operaciones_aritmeticas_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUMA70=null;
		Token RESTA71=null;
		ParserRuleReturnScope multiplicacion69 =null;
		ParserRuleReturnScope multiplicacion72 =null;

		CommonTree SUMA70_tree=null;
		CommonTree RESTA71_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:184:24: ( multiplicacion ( ( SUMA ^| RESTA ^) multiplicacion )* )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:184:26: multiplicacion ( ( SUMA ^| RESTA ^) multiplicacion )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicacion_in_operaciones_aritmeticas454);
			multiplicacion69=multiplicacion();
			state._fsp--;

			adaptor.addChild(root_0, multiplicacion69.getTree());

			// E:\\Documentos\\to explode\\LenguajeUTB.g:184:41: ( ( SUMA ^| RESTA ^) multiplicacion )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==RESTA||LA11_0==SUMA) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:184:42: ( SUMA ^| RESTA ^) multiplicacion
					{
					// E:\\Documentos\\to explode\\LenguajeUTB.g:184:42: ( SUMA ^| RESTA ^)
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==SUMA) ) {
						alt10=1;
					}
					else if ( (LA10_0==RESTA) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:184:43: SUMA ^
							{
							SUMA70=(Token)match(input,SUMA,FOLLOW_SUMA_in_operaciones_aritmeticas458); 
							SUMA70_tree = (CommonTree)adaptor.create(SUMA70);
							root_0 = (CommonTree)adaptor.becomeRoot(SUMA70_tree, root_0);

							}
							break;
						case 2 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:184:49: RESTA ^
							{
							RESTA71=(Token)match(input,RESTA,FOLLOW_RESTA_in_operaciones_aritmeticas461); 
							RESTA71_tree = (CommonTree)adaptor.create(RESTA71);
							root_0 = (CommonTree)adaptor.becomeRoot(RESTA71_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multiplicacion_in_operaciones_aritmeticas465);
					multiplicacion72=multiplicacion();
					state._fsp--;

					adaptor.addChild(root_0, multiplicacion72.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operaciones_aritmeticas"


	public static class multiplicacion_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicacion"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:185:1: multiplicacion : atom ( ( MULTIPLICACION ^| DIVISION ^| MODULO ^) atom )* ;
	public final LenguajeUTBParser.multiplicacion_return multiplicacion() throws RecognitionException {
		LenguajeUTBParser.multiplicacion_return retval = new LenguajeUTBParser.multiplicacion_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULTIPLICACION74=null;
		Token DIVISION75=null;
		Token MODULO76=null;
		ParserRuleReturnScope atom73 =null;
		ParserRuleReturnScope atom77 =null;

		CommonTree MULTIPLICACION74_tree=null;
		CommonTree DIVISION75_tree=null;
		CommonTree MODULO76_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:185:16: ( atom ( ( MULTIPLICACION ^| DIVISION ^| MODULO ^) atom )* )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:185:18: atom ( ( MULTIPLICACION ^| DIVISION ^| MODULO ^) atom )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_atom_in_multiplicacion474);
			atom73=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom73.getTree());

			// E:\\Documentos\\to explode\\LenguajeUTB.g:185:23: ( ( MULTIPLICACION ^| DIVISION ^| MODULO ^) atom )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DIVISION||LA13_0==MODULO||LA13_0==MULTIPLICACION) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:185:24: ( MULTIPLICACION ^| DIVISION ^| MODULO ^) atom
					{
					// E:\\Documentos\\to explode\\LenguajeUTB.g:185:24: ( MULTIPLICACION ^| DIVISION ^| MODULO ^)
					int alt12=3;
					switch ( input.LA(1) ) {
					case MULTIPLICACION:
						{
						alt12=1;
						}
						break;
					case DIVISION:
						{
						alt12=2;
						}
						break;
					case MODULO:
						{
						alt12=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}
					switch (alt12) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:185:25: MULTIPLICACION ^
							{
							MULTIPLICACION74=(Token)match(input,MULTIPLICACION,FOLLOW_MULTIPLICACION_in_multiplicacion478); 
							MULTIPLICACION74_tree = (CommonTree)adaptor.create(MULTIPLICACION74);
							root_0 = (CommonTree)adaptor.becomeRoot(MULTIPLICACION74_tree, root_0);

							}
							break;
						case 2 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:185:41: DIVISION ^
							{
							DIVISION75=(Token)match(input,DIVISION,FOLLOW_DIVISION_in_multiplicacion481); 
							DIVISION75_tree = (CommonTree)adaptor.create(DIVISION75);
							root_0 = (CommonTree)adaptor.becomeRoot(DIVISION75_tree, root_0);

							}
							break;
						case 3 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:185:51: MODULO ^
							{
							MODULO76=(Token)match(input,MODULO,FOLLOW_MODULO_in_multiplicacion484); 
							MODULO76_tree = (CommonTree)adaptor.create(MODULO76);
							root_0 = (CommonTree)adaptor.becomeRoot(MODULO76_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_atom_in_multiplicacion488);
					atom77=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom77.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicacion"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:186:1: atom : ( valor | PARENTECIS_ABRE operaciones_aritmeticas PARENTECIS_CIERRA -> ^( EXPRESIONES operaciones_aritmeticas ) );
	public final LenguajeUTBParser.atom_return atom() throws RecognitionException {
		LenguajeUTBParser.atom_return retval = new LenguajeUTBParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PARENTECIS_ABRE79=null;
		Token PARENTECIS_CIERRA81=null;
		ParserRuleReturnScope valor78 =null;
		ParserRuleReturnScope operaciones_aritmeticas80 =null;

		CommonTree PARENTECIS_ABRE79_tree=null;
		CommonTree PARENTECIS_CIERRA81_tree=null;
		RewriteRuleTokenStream stream_PARENTECIS_ABRE=new RewriteRuleTokenStream(adaptor,"token PARENTECIS_ABRE");
		RewriteRuleTokenStream stream_PARENTECIS_CIERRA=new RewriteRuleTokenStream(adaptor,"token PARENTECIS_CIERRA");
		RewriteRuleSubtreeStream stream_operaciones_aritmeticas=new RewriteRuleSubtreeStream(adaptor,"rule operaciones_aritmeticas");

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:186:6: ( valor | PARENTECIS_ABRE operaciones_aritmeticas PARENTECIS_CIERRA -> ^( EXPRESIONES operaciones_aritmeticas ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==FALSO||LA14_0==FLOAT||LA14_0==ID||LA14_0==INT||LA14_0==STRING||LA14_0==VERDADERO) ) {
				alt14=1;
			}
			else if ( (LA14_0==PARENTECIS_ABRE) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:186:9: valor
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_valor_in_atom498);
					valor78=valor();
					state._fsp--;

					adaptor.addChild(root_0, valor78.getTree());

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:186:15: PARENTECIS_ABRE operaciones_aritmeticas PARENTECIS_CIERRA
					{
					PARENTECIS_ABRE79=(Token)match(input,PARENTECIS_ABRE,FOLLOW_PARENTECIS_ABRE_in_atom500);  
					stream_PARENTECIS_ABRE.add(PARENTECIS_ABRE79);

					pushFollow(FOLLOW_operaciones_aritmeticas_in_atom502);
					operaciones_aritmeticas80=operaciones_aritmeticas();
					state._fsp--;

					stream_operaciones_aritmeticas.add(operaciones_aritmeticas80.getTree());
					PARENTECIS_CIERRA81=(Token)match(input,PARENTECIS_CIERRA,FOLLOW_PARENTECIS_CIERRA_in_atom504);  
					stream_PARENTECIS_CIERRA.add(PARENTECIS_CIERRA81);

					// AST REWRITE
					// elements: operaciones_aritmeticas
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 186:72: -> ^( EXPRESIONES operaciones_aritmeticas )
					{
						// E:\\Documentos\\to explode\\LenguajeUTB.g:186:74: ^( EXPRESIONES operaciones_aritmeticas )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESIONES, "EXPRESIONES"), root_1);
						adaptor.addChild(root_1, stream_operaciones_aritmeticas.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class valor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "valor"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:187:1: valor : ( ID | STRING | INT | FLOAT | ( VERDADERO | FALSO ) );
	public final LenguajeUTBParser.valor_return valor() throws RecognitionException {
		LenguajeUTBParser.valor_return retval = new LenguajeUTBParser.valor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set82=null;

		CommonTree set82_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:187:7: ( ID | STRING | INT | FLOAT | ( VERDADERO | FALSO ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set82=input.LT(1);
			if ( input.LA(1)==FALSO||input.LA(1)==FLOAT||input.LA(1)==ID||input.LA(1)==INT||input.LA(1)==STRING||input.LA(1)==VERDADERO ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set82));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valor"


	public static class op_listas_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "op_listas"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:190:1: op_listas : ( OP_LISTAS ^ operaciones_listas ) ;
	public final LenguajeUTBParser.op_listas_return op_listas() throws RecognitionException {
		LenguajeUTBParser.op_listas_return retval = new LenguajeUTBParser.op_listas_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OP_LISTAS83=null;
		ParserRuleReturnScope operaciones_listas84 =null;

		CommonTree OP_LISTAS83_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:190:19: ( ( OP_LISTAS ^ operaciones_listas ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:190:21: ( OP_LISTAS ^ operaciones_listas )
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTB.g:190:21: ( OP_LISTAS ^ operaciones_listas )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:190:22: OP_LISTAS ^ operaciones_listas
			{
			OP_LISTAS83=(Token)match(input,OP_LISTAS,FOLLOW_OP_LISTAS_in_op_listas548); 
			OP_LISTAS83_tree = (CommonTree)adaptor.create(OP_LISTAS83);
			root_0 = (CommonTree)adaptor.becomeRoot(OP_LISTAS83_tree, root_0);

			pushFollow(FOLLOW_operaciones_listas_in_op_listas551);
			operaciones_listas84=operaciones_listas();
			state._fsp--;

			adaptor.addChild(root_0, operaciones_listas84.getTree());

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "op_listas"


	public static class operaciones_listas_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operaciones_listas"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:191:1: operaciones_listas : ( agregar_a_lista | modificar_de_lista ) ;
	public final LenguajeUTBParser.operaciones_listas_return operaciones_listas() throws RecognitionException {
		LenguajeUTBParser.operaciones_listas_return retval = new LenguajeUTBParser.operaciones_listas_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope agregar_a_lista85 =null;
		ParserRuleReturnScope modificar_de_lista86 =null;


		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:191:19: ( ( agregar_a_lista | modificar_de_lista ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:191:21: ( agregar_a_lista | modificar_de_lista )
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTB.g:191:21: ( agregar_a_lista | modificar_de_lista )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==AGREGAR) ) {
				alt15=1;
			}
			else if ( (LA15_0==CAMBIAR) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:191:22: agregar_a_lista
					{
					pushFollow(FOLLOW_agregar_a_lista_in_operaciones_listas559);
					agregar_a_lista85=agregar_a_lista();
					state._fsp--;

					adaptor.addChild(root_0, agregar_a_lista85.getTree());

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:191:38: modificar_de_lista
					{
					pushFollow(FOLLOW_modificar_de_lista_in_operaciones_listas561);
					modificar_de_lista86=modificar_de_lista();
					state._fsp--;

					adaptor.addChild(root_0, modificar_de_lista86.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operaciones_listas"


	public static class agregar_a_lista_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "agregar_a_lista"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:192:1: agregar_a_lista : AGREGAR ^ A ! ID '<-' ! valor ;
	public final LenguajeUTBParser.agregar_a_lista_return agregar_a_lista() throws RecognitionException {
		LenguajeUTBParser.agregar_a_lista_return retval = new LenguajeUTBParser.agregar_a_lista_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AGREGAR87=null;
		Token A88=null;
		Token ID89=null;
		Token string_literal90=null;
		ParserRuleReturnScope valor91 =null;

		CommonTree AGREGAR87_tree=null;
		CommonTree A88_tree=null;
		CommonTree ID89_tree=null;
		CommonTree string_literal90_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:192:16: ( AGREGAR ^ A ! ID '<-' ! valor )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:192:18: AGREGAR ^ A ! ID '<-' ! valor
			{
			root_0 = (CommonTree)adaptor.nil();


			AGREGAR87=(Token)match(input,AGREGAR,FOLLOW_AGREGAR_in_agregar_a_lista568); 
			AGREGAR87_tree = (CommonTree)adaptor.create(AGREGAR87);
			root_0 = (CommonTree)adaptor.becomeRoot(AGREGAR87_tree, root_0);

			A88=(Token)match(input,A,FOLLOW_A_in_agregar_a_lista571); 
			ID89=(Token)match(input,ID,FOLLOW_ID_in_agregar_a_lista574); 
			ID89_tree = (CommonTree)adaptor.create(ID89);
			adaptor.addChild(root_0, ID89_tree);

			string_literal90=(Token)match(input,93,FOLLOW_93_in_agregar_a_lista576); 
			pushFollow(FOLLOW_valor_in_agregar_a_lista579);
			valor91=valor();
			state._fsp--;

			adaptor.addChild(root_0, valor91.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "agregar_a_lista"


	public static class modificar_de_lista_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "modificar_de_lista"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:193:1: modificar_de_lista : CAMBIAR ^ VALOR ! DE ! ID POSICION valor POR valor ;
	public final LenguajeUTBParser.modificar_de_lista_return modificar_de_lista() throws RecognitionException {
		LenguajeUTBParser.modificar_de_lista_return retval = new LenguajeUTBParser.modificar_de_lista_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CAMBIAR92=null;
		Token VALOR93=null;
		Token DE94=null;
		Token ID95=null;
		Token POSICION96=null;
		Token POR98=null;
		ParserRuleReturnScope valor97 =null;
		ParserRuleReturnScope valor99 =null;

		CommonTree CAMBIAR92_tree=null;
		CommonTree VALOR93_tree=null;
		CommonTree DE94_tree=null;
		CommonTree ID95_tree=null;
		CommonTree POSICION96_tree=null;
		CommonTree POR98_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:193:19: ( CAMBIAR ^ VALOR ! DE ! ID POSICION valor POR valor )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:193:21: CAMBIAR ^ VALOR ! DE ! ID POSICION valor POR valor
			{
			root_0 = (CommonTree)adaptor.nil();


			CAMBIAR92=(Token)match(input,CAMBIAR,FOLLOW_CAMBIAR_in_modificar_de_lista586); 
			CAMBIAR92_tree = (CommonTree)adaptor.create(CAMBIAR92);
			root_0 = (CommonTree)adaptor.becomeRoot(CAMBIAR92_tree, root_0);

			VALOR93=(Token)match(input,VALOR,FOLLOW_VALOR_in_modificar_de_lista589); 
			DE94=(Token)match(input,DE,FOLLOW_DE_in_modificar_de_lista592); 
			ID95=(Token)match(input,ID,FOLLOW_ID_in_modificar_de_lista595); 
			ID95_tree = (CommonTree)adaptor.create(ID95);
			adaptor.addChild(root_0, ID95_tree);

			POSICION96=(Token)match(input,POSICION,FOLLOW_POSICION_in_modificar_de_lista597); 
			POSICION96_tree = (CommonTree)adaptor.create(POSICION96);
			adaptor.addChild(root_0, POSICION96_tree);

			pushFollow(FOLLOW_valor_in_modificar_de_lista599);
			valor97=valor();
			state._fsp--;

			adaptor.addChild(root_0, valor97.getTree());

			POR98=(Token)match(input,POR,FOLLOW_POR_in_modificar_de_lista601); 
			POR98_tree = (CommonTree)adaptor.create(POR98);
			adaptor.addChild(root_0, POR98_tree);

			pushFollow(FOLLOW_valor_in_modificar_de_lista603);
			valor99=valor();
			state._fsp--;

			adaptor.addChild(root_0, valor99.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modificar_de_lista"


	public static class op_matrices_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "op_matrices"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:197:1: op_matrices : ( OP_LISTAS ^ operaciones_matrices ) ;
	public final LenguajeUTBParser.op_matrices_return op_matrices() throws RecognitionException {
		LenguajeUTBParser.op_matrices_return retval = new LenguajeUTBParser.op_matrices_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OP_LISTAS100=null;
		ParserRuleReturnScope operaciones_matrices101 =null;

		CommonTree OP_LISTAS100_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:197:12: ( ( OP_LISTAS ^ operaciones_matrices ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:197:15: ( OP_LISTAS ^ operaciones_matrices )
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTB.g:197:15: ( OP_LISTAS ^ operaciones_matrices )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:197:16: OP_LISTAS ^ operaciones_matrices
			{
			OP_LISTAS100=(Token)match(input,OP_LISTAS,FOLLOW_OP_LISTAS_in_op_matrices614); 
			OP_LISTAS100_tree = (CommonTree)adaptor.create(OP_LISTAS100);
			root_0 = (CommonTree)adaptor.becomeRoot(OP_LISTAS100_tree, root_0);

			pushFollow(FOLLOW_operaciones_matrices_in_op_matrices617);
			operaciones_matrices101=operaciones_matrices();
			state._fsp--;

			adaptor.addChild(root_0, operaciones_matrices101.getTree());

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "op_matrices"


	public static class operaciones_matrices_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operaciones_matrices"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:198:1: operaciones_matrices : modificar_de_matriz ;
	public final LenguajeUTBParser.operaciones_matrices_return operaciones_matrices() throws RecognitionException {
		LenguajeUTBParser.operaciones_matrices_return retval = new LenguajeUTBParser.operaciones_matrices_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope modificar_de_matriz102 =null;


		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:198:21: ( modificar_de_matriz )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:198:23: modificar_de_matriz
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_modificar_de_matriz_in_operaciones_matrices625);
			modificar_de_matriz102=modificar_de_matriz();
			state._fsp--;

			adaptor.addChild(root_0, modificar_de_matriz102.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operaciones_matrices"


	public static class modificar_de_matriz_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "modificar_de_matriz"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:200:1: modificar_de_matriz : CAMBIAR ^ VALOR ! DE ! ID COORDENADA coordenada POR valor ;
	public final LenguajeUTBParser.modificar_de_matriz_return modificar_de_matriz() throws RecognitionException {
		LenguajeUTBParser.modificar_de_matriz_return retval = new LenguajeUTBParser.modificar_de_matriz_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CAMBIAR103=null;
		Token VALOR104=null;
		Token DE105=null;
		Token ID106=null;
		Token COORDENADA107=null;
		Token POR109=null;
		ParserRuleReturnScope coordenada108 =null;
		ParserRuleReturnScope valor110 =null;

		CommonTree CAMBIAR103_tree=null;
		CommonTree VALOR104_tree=null;
		CommonTree DE105_tree=null;
		CommonTree ID106_tree=null;
		CommonTree COORDENADA107_tree=null;
		CommonTree POR109_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:200:20: ( CAMBIAR ^ VALOR ! DE ! ID COORDENADA coordenada POR valor )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:200:23: CAMBIAR ^ VALOR ! DE ! ID COORDENADA coordenada POR valor
			{
			root_0 = (CommonTree)adaptor.nil();


			CAMBIAR103=(Token)match(input,CAMBIAR,FOLLOW_CAMBIAR_in_modificar_de_matriz633); 
			CAMBIAR103_tree = (CommonTree)adaptor.create(CAMBIAR103);
			root_0 = (CommonTree)adaptor.becomeRoot(CAMBIAR103_tree, root_0);

			VALOR104=(Token)match(input,VALOR,FOLLOW_VALOR_in_modificar_de_matriz636); 
			DE105=(Token)match(input,DE,FOLLOW_DE_in_modificar_de_matriz639); 
			ID106=(Token)match(input,ID,FOLLOW_ID_in_modificar_de_matriz642); 
			ID106_tree = (CommonTree)adaptor.create(ID106);
			adaptor.addChild(root_0, ID106_tree);

			COORDENADA107=(Token)match(input,COORDENADA,FOLLOW_COORDENADA_in_modificar_de_matriz644); 
			COORDENADA107_tree = (CommonTree)adaptor.create(COORDENADA107);
			adaptor.addChild(root_0, COORDENADA107_tree);

			pushFollow(FOLLOW_coordenada_in_modificar_de_matriz646);
			coordenada108=coordenada();
			state._fsp--;

			adaptor.addChild(root_0, coordenada108.getTree());

			POR109=(Token)match(input,POR,FOLLOW_POR_in_modificar_de_matriz648); 
			POR109_tree = (CommonTree)adaptor.create(POR109);
			adaptor.addChild(root_0, POR109_tree);

			pushFollow(FOLLOW_valor_in_modificar_de_matriz650);
			valor110=valor();
			state._fsp--;

			adaptor.addChild(root_0, valor110.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modificar_de_matriz"


	public static class coordenada_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "coordenada"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:201:1: coordenada : PARENTECIS_ABRE ! ( INT COMA ! INT ) PARENTECIS_ABRE !;
	public final LenguajeUTBParser.coordenada_return coordenada() throws RecognitionException {
		LenguajeUTBParser.coordenada_return retval = new LenguajeUTBParser.coordenada_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PARENTECIS_ABRE111=null;
		Token INT112=null;
		Token COMA113=null;
		Token INT114=null;
		Token PARENTECIS_ABRE115=null;

		CommonTree PARENTECIS_ABRE111_tree=null;
		CommonTree INT112_tree=null;
		CommonTree COMA113_tree=null;
		CommonTree INT114_tree=null;
		CommonTree PARENTECIS_ABRE115_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:201:11: ( PARENTECIS_ABRE ! ( INT COMA ! INT ) PARENTECIS_ABRE !)
			// E:\\Documentos\\to explode\\LenguajeUTB.g:201:15: PARENTECIS_ABRE ! ( INT COMA ! INT ) PARENTECIS_ABRE !
			{
			root_0 = (CommonTree)adaptor.nil();


			PARENTECIS_ABRE111=(Token)match(input,PARENTECIS_ABRE,FOLLOW_PARENTECIS_ABRE_in_coordenada659); 
			// E:\\Documentos\\to explode\\LenguajeUTB.g:201:32: ( INT COMA ! INT )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:201:33: INT COMA ! INT
			{
			INT112=(Token)match(input,INT,FOLLOW_INT_in_coordenada663); 
			INT112_tree = (CommonTree)adaptor.create(INT112);
			adaptor.addChild(root_0, INT112_tree);

			COMA113=(Token)match(input,COMA,FOLLOW_COMA_in_coordenada665); 
			INT114=(Token)match(input,INT,FOLLOW_INT_in_coordenada668); 
			INT114_tree = (CommonTree)adaptor.create(INT114);
			adaptor.addChild(root_0, INT114_tree);

			}

			PARENTECIS_ABRE115=(Token)match(input,PARENTECIS_ABRE,FOLLOW_PARENTECIS_ABRE_in_coordenada671); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "coordenada"


	public static class leer_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "leer"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:204:1: leer : ( ESCRIBIR ^ ID ) ;
	public final LenguajeUTBParser.leer_return leer() throws RecognitionException {
		LenguajeUTBParser.leer_return retval = new LenguajeUTBParser.leer_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ESCRIBIR116=null;
		Token ID117=null;

		CommonTree ESCRIBIR116_tree=null;
		CommonTree ID117_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:204:6: ( ( ESCRIBIR ^ ID ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:204:8: ( ESCRIBIR ^ ID )
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTB.g:204:8: ( ESCRIBIR ^ ID )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:204:9: ESCRIBIR ^ ID
			{
			ESCRIBIR116=(Token)match(input,ESCRIBIR,FOLLOW_ESCRIBIR_in_leer683); 
			ESCRIBIR116_tree = (CommonTree)adaptor.create(ESCRIBIR116);
			root_0 = (CommonTree)adaptor.becomeRoot(ESCRIBIR116_tree, root_0);

			ID117=(Token)match(input,ID,FOLLOW_ID_in_leer686); 
			ID117_tree = (CommonTree)adaptor.create(ID117);
			adaptor.addChild(root_0, ID117_tree);

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "leer"


	public static class si_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "si"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:207:1: si : SI ^ condicion ENTONCES ! ( sentencia )* ( SINO ENTONCES ( sentencia )* )* FIN_SI !;
	public final LenguajeUTBParser.si_return si() throws RecognitionException {
		LenguajeUTBParser.si_return retval = new LenguajeUTBParser.si_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SI118=null;
		Token ENTONCES120=null;
		Token SINO122=null;
		Token ENTONCES123=null;
		Token FIN_SI125=null;
		ParserRuleReturnScope condicion119 =null;
		ParserRuleReturnScope sentencia121 =null;
		ParserRuleReturnScope sentencia124 =null;

		CommonTree SI118_tree=null;
		CommonTree ENTONCES120_tree=null;
		CommonTree SINO122_tree=null;
		CommonTree ENTONCES123_tree=null;
		CommonTree FIN_SI125_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:207:4: ( SI ^ condicion ENTONCES ! ( sentencia )* ( SINO ENTONCES ( sentencia )* )* FIN_SI !)
			// E:\\Documentos\\to explode\\LenguajeUTB.g:207:9: SI ^ condicion ENTONCES ! ( sentencia )* ( SINO ENTONCES ( sentencia )* )* FIN_SI !
			{
			root_0 = (CommonTree)adaptor.nil();


			SI118=(Token)match(input,SI,FOLLOW_SI_in_si699); 
			SI118_tree = (CommonTree)adaptor.create(SI118);
			root_0 = (CommonTree)adaptor.becomeRoot(SI118_tree, root_0);

			pushFollow(FOLLOW_condicion_in_si702);
			condicion119=condicion();
			state._fsp--;

			adaptor.addChild(root_0, condicion119.getTree());

			ENTONCES120=(Token)match(input,ENTONCES,FOLLOW_ENTONCES_in_si704); 
			// E:\\Documentos\\to explode\\LenguajeUTB.g:207:33: ( sentencia )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==AGREGAR||LA16_0==CAMBIAR||LA16_0==ESCRIBIR||LA16_0==ID||LA16_0==MIENTRAS||LA16_0==MOSTRAR||LA16_0==PARA||LA16_0==SI) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:207:34: sentencia
					{
					pushFollow(FOLLOW_sentencia_in_si708);
					sentencia121=sentencia();
					state._fsp--;

					adaptor.addChild(root_0, sentencia121.getTree());

					}
					break;

				default :
					break loop16;
				}
			}

			// E:\\Documentos\\to explode\\LenguajeUTB.g:207:46: ( SINO ENTONCES ( sentencia )* )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==SINO) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:207:47: SINO ENTONCES ( sentencia )*
					{
					SINO122=(Token)match(input,SINO,FOLLOW_SINO_in_si713); 
					SINO122_tree = (CommonTree)adaptor.create(SINO122);
					adaptor.addChild(root_0, SINO122_tree);

					ENTONCES123=(Token)match(input,ENTONCES,FOLLOW_ENTONCES_in_si715); 
					ENTONCES123_tree = (CommonTree)adaptor.create(ENTONCES123);
					adaptor.addChild(root_0, ENTONCES123_tree);

					// E:\\Documentos\\to explode\\LenguajeUTB.g:207:60: ( sentencia )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==AGREGAR||LA17_0==CAMBIAR||LA17_0==ESCRIBIR||LA17_0==ID||LA17_0==MIENTRAS||LA17_0==MOSTRAR||LA17_0==PARA||LA17_0==SI) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:207:61: sentencia
							{
							pushFollow(FOLLOW_sentencia_in_si717);
							sentencia124=sentencia();
							state._fsp--;

							adaptor.addChild(root_0, sentencia124.getTree());

							}
							break;

						default :
							break loop17;
						}
					}

					}
					break;

				default :
					break loop18;
				}
			}

			FIN_SI125=(Token)match(input,FIN_SI,FOLLOW_FIN_SI_in_si723); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "si"


	public static class mientras_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mientras"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:208:1: mientras : MIENTRAS ^ condicion ':' ! ( sentencia )* FIN_MIENTRAS !;
	public final LenguajeUTBParser.mientras_return mientras() throws RecognitionException {
		LenguajeUTBParser.mientras_return retval = new LenguajeUTBParser.mientras_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MIENTRAS126=null;
		Token char_literal128=null;
		Token FIN_MIENTRAS130=null;
		ParserRuleReturnScope condicion127 =null;
		ParserRuleReturnScope sentencia129 =null;

		CommonTree MIENTRAS126_tree=null;
		CommonTree char_literal128_tree=null;
		CommonTree FIN_MIENTRAS130_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:208:9: ( MIENTRAS ^ condicion ':' ! ( sentencia )* FIN_MIENTRAS !)
			// E:\\Documentos\\to explode\\LenguajeUTB.g:208:14: MIENTRAS ^ condicion ':' ! ( sentencia )* FIN_MIENTRAS !
			{
			root_0 = (CommonTree)adaptor.nil();


			MIENTRAS126=(Token)match(input,MIENTRAS,FOLLOW_MIENTRAS_in_mientras733); 
			MIENTRAS126_tree = (CommonTree)adaptor.create(MIENTRAS126);
			root_0 = (CommonTree)adaptor.becomeRoot(MIENTRAS126_tree, root_0);

			pushFollow(FOLLOW_condicion_in_mientras736);
			condicion127=condicion();
			state._fsp--;

			adaptor.addChild(root_0, condicion127.getTree());

			char_literal128=(Token)match(input,92,FOLLOW_92_in_mientras738); 
			// E:\\Documentos\\to explode\\LenguajeUTB.g:208:39: ( sentencia )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==AGREGAR||LA19_0==CAMBIAR||LA19_0==ESCRIBIR||LA19_0==ID||LA19_0==MIENTRAS||LA19_0==MOSTRAR||LA19_0==PARA||LA19_0==SI) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:208:40: sentencia
					{
					pushFollow(FOLLOW_sentencia_in_mientras742);
					sentencia129=sentencia();
					state._fsp--;

					adaptor.addChild(root_0, sentencia129.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

			FIN_MIENTRAS130=(Token)match(input,FIN_MIENTRAS,FOLLOW_FIN_MIENTRAS_in_mientras747); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mientras"


	public static class para_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "para"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:209:1: para : PARA ^ ID EN ( ( RANGO DE INT A INT ) | ID ) ':' ! ( sentencia )* FIN_PARA !;
	public final LenguajeUTBParser.para_return para() throws RecognitionException {
		LenguajeUTBParser.para_return retval = new LenguajeUTBParser.para_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PARA131=null;
		Token ID132=null;
		Token EN133=null;
		Token RANGO134=null;
		Token DE135=null;
		Token INT136=null;
		Token A137=null;
		Token INT138=null;
		Token ID139=null;
		Token char_literal140=null;
		Token FIN_PARA142=null;
		ParserRuleReturnScope sentencia141 =null;

		CommonTree PARA131_tree=null;
		CommonTree ID132_tree=null;
		CommonTree EN133_tree=null;
		CommonTree RANGO134_tree=null;
		CommonTree DE135_tree=null;
		CommonTree INT136_tree=null;
		CommonTree A137_tree=null;
		CommonTree INT138_tree=null;
		CommonTree ID139_tree=null;
		CommonTree char_literal140_tree=null;
		CommonTree FIN_PARA142_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:209:6: ( PARA ^ ID EN ( ( RANGO DE INT A INT ) | ID ) ':' ! ( sentencia )* FIN_PARA !)
			// E:\\Documentos\\to explode\\LenguajeUTB.g:209:8: PARA ^ ID EN ( ( RANGO DE INT A INT ) | ID ) ':' ! ( sentencia )* FIN_PARA !
			{
			root_0 = (CommonTree)adaptor.nil();


			PARA131=(Token)match(input,PARA,FOLLOW_PARA_in_para755); 
			PARA131_tree = (CommonTree)adaptor.create(PARA131);
			root_0 = (CommonTree)adaptor.becomeRoot(PARA131_tree, root_0);

			ID132=(Token)match(input,ID,FOLLOW_ID_in_para758); 
			ID132_tree = (CommonTree)adaptor.create(ID132);
			adaptor.addChild(root_0, ID132_tree);

			EN133=(Token)match(input,EN,FOLLOW_EN_in_para760); 
			EN133_tree = (CommonTree)adaptor.create(EN133);
			adaptor.addChild(root_0, EN133_tree);

			// E:\\Documentos\\to explode\\LenguajeUTB.g:209:20: ( ( RANGO DE INT A INT ) | ID )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==RANGO) ) {
				alt20=1;
			}
			else if ( (LA20_0==ID) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:209:21: ( RANGO DE INT A INT )
					{
					// E:\\Documentos\\to explode\\LenguajeUTB.g:209:21: ( RANGO DE INT A INT )
					// E:\\Documentos\\to explode\\LenguajeUTB.g:209:22: RANGO DE INT A INT
					{
					RANGO134=(Token)match(input,RANGO,FOLLOW_RANGO_in_para764); 
					RANGO134_tree = (CommonTree)adaptor.create(RANGO134);
					adaptor.addChild(root_0, RANGO134_tree);

					DE135=(Token)match(input,DE,FOLLOW_DE_in_para766); 
					DE135_tree = (CommonTree)adaptor.create(DE135);
					adaptor.addChild(root_0, DE135_tree);

					INT136=(Token)match(input,INT,FOLLOW_INT_in_para768); 
					INT136_tree = (CommonTree)adaptor.create(INT136);
					adaptor.addChild(root_0, INT136_tree);

					A137=(Token)match(input,A,FOLLOW_A_in_para770); 
					A137_tree = (CommonTree)adaptor.create(A137);
					adaptor.addChild(root_0, A137_tree);

					INT138=(Token)match(input,INT,FOLLOW_INT_in_para772); 
					INT138_tree = (CommonTree)adaptor.create(INT138);
					adaptor.addChild(root_0, INT138_tree);

					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:209:43: ID
					{
					ID139=(Token)match(input,ID,FOLLOW_ID_in_para776); 
					ID139_tree = (CommonTree)adaptor.create(ID139);
					adaptor.addChild(root_0, ID139_tree);

					}
					break;

			}

			char_literal140=(Token)match(input,92,FOLLOW_92_in_para779); 
			// E:\\Documentos\\to explode\\LenguajeUTB.g:209:52: ( sentencia )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==AGREGAR||LA21_0==CAMBIAR||LA21_0==ESCRIBIR||LA21_0==ID||LA21_0==MIENTRAS||LA21_0==MOSTRAR||LA21_0==PARA||LA21_0==SI) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:209:53: sentencia
					{
					pushFollow(FOLLOW_sentencia_in_para783);
					sentencia141=sentencia();
					state._fsp--;

					adaptor.addChild(root_0, sentencia141.getTree());

					}
					break;

				default :
					break loop21;
				}
			}

			FIN_PARA142=(Token)match(input,FIN_PARA,FOLLOW_FIN_PARA_in_para787); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "para"


	public static class sentencia_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sentencia"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:211:1: sentencia : ( leer | si | mientras | para | ( ID IGUAL ! operaciones ) | conversion_implicita | conversion_explicita | mostrar | operaciones_listas | operaciones_matrices );
	public final LenguajeUTBParser.sentencia_return sentencia() throws RecognitionException {
		LenguajeUTBParser.sentencia_return retval = new LenguajeUTBParser.sentencia_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID147=null;
		Token IGUAL148=null;
		ParserRuleReturnScope leer143 =null;
		ParserRuleReturnScope si144 =null;
		ParserRuleReturnScope mientras145 =null;
		ParserRuleReturnScope para146 =null;
		ParserRuleReturnScope operaciones149 =null;
		ParserRuleReturnScope conversion_implicita150 =null;
		ParserRuleReturnScope conversion_explicita151 =null;
		ParserRuleReturnScope mostrar152 =null;
		ParserRuleReturnScope operaciones_listas153 =null;
		ParserRuleReturnScope operaciones_matrices154 =null;

		CommonTree ID147_tree=null;
		CommonTree IGUAL148_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:211:11: ( leer | si | mientras | para | ( ID IGUAL ! operaciones ) | conversion_implicita | conversion_explicita | mostrar | operaciones_listas | operaciones_matrices )
			int alt22=10;
			switch ( input.LA(1) ) {
			case ESCRIBIR:
				{
				alt22=1;
				}
				break;
			case SI:
				{
				alt22=2;
				}
				break;
			case MIENTRAS:
				{
				alt22=3;
				}
				break;
			case PARA:
				{
				alt22=4;
				}
				break;
			case ID:
				{
				alt22=5;
				}
				break;
			case CAMBIAR:
				{
				int LA22_6 = input.LA(2);
				if ( (LA22_6==VALOR) ) {
					int LA22_9 = input.LA(3);
					if ( (LA22_9==DE) ) {
						int LA22_10 = input.LA(4);
						if ( (LA22_10==ID) ) {
							switch ( input.LA(5) ) {
							case POR:
								{
								int LA22_12 = input.LA(6);
								if ( (LA22_12==ID) ) {
									alt22=6;
								}
								else if ( (LA22_12==CONVERTIR) ) {
									alt22=7;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 22, 12, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case POSICION:
								{
								alt22=9;
								}
								break;
							case COORDENADA:
								{
								alt22=10;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 22, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 22, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MOSTRAR:
				{
				alt22=8;
				}
				break;
			case AGREGAR:
				{
				alt22=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:211:13: leer
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_leer_in_sentencia796);
					leer143=leer();
					state._fsp--;

					adaptor.addChild(root_0, leer143.getTree());

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:211:19: si
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_si_in_sentencia799);
					si144=si();
					state._fsp--;

					adaptor.addChild(root_0, si144.getTree());

					}
					break;
				case 3 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:211:23: mientras
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_mientras_in_sentencia802);
					mientras145=mientras();
					state._fsp--;

					adaptor.addChild(root_0, mientras145.getTree());

					}
					break;
				case 4 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:211:33: para
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_para_in_sentencia805);
					para146=para();
					state._fsp--;

					adaptor.addChild(root_0, para146.getTree());

					}
					break;
				case 5 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:211:40: ( ID IGUAL ! operaciones )
					{
					root_0 = (CommonTree)adaptor.nil();


					// E:\\Documentos\\to explode\\LenguajeUTB.g:211:40: ( ID IGUAL ! operaciones )
					// E:\\Documentos\\to explode\\LenguajeUTB.g:211:41: ID IGUAL ! operaciones
					{
					ID147=(Token)match(input,ID,FOLLOW_ID_in_sentencia810); 
					ID147_tree = (CommonTree)adaptor.create(ID147);
					adaptor.addChild(root_0, ID147_tree);

					IGUAL148=(Token)match(input,IGUAL,FOLLOW_IGUAL_in_sentencia812); 
					pushFollow(FOLLOW_operaciones_in_sentencia815);
					operaciones149=operaciones();
					state._fsp--;

					adaptor.addChild(root_0, operaciones149.getTree());

					}

					}
					break;
				case 6 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:211:65: conversion_implicita
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_conversion_implicita_in_sentencia819);
					conversion_implicita150=conversion_implicita();
					state._fsp--;

					adaptor.addChild(root_0, conversion_implicita150.getTree());

					}
					break;
				case 7 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:211:86: conversion_explicita
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_conversion_explicita_in_sentencia821);
					conversion_explicita151=conversion_explicita();
					state._fsp--;

					adaptor.addChild(root_0, conversion_explicita151.getTree());

					}
					break;
				case 8 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:211:108: mostrar
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_mostrar_in_sentencia824);
					mostrar152=mostrar();
					state._fsp--;

					adaptor.addChild(root_0, mostrar152.getTree());

					}
					break;
				case 9 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:211:116: operaciones_listas
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_operaciones_listas_in_sentencia826);
					operaciones_listas153=operaciones_listas();
					state._fsp--;

					adaptor.addChild(root_0, operaciones_listas153.getTree());

					}
					break;
				case 10 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:211:135: operaciones_matrices
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_operaciones_matrices_in_sentencia828);
					operaciones_matrices154=operaciones_matrices();
					state._fsp--;

					adaptor.addChild(root_0, operaciones_matrices154.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sentencia"


	public static class condicion_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "condicion"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:213:1: condicion : ( ID | ( operaciones op_logicos operaciones ( ( CONJUNCION ^| DISYUNCION ^) operaciones op_logicos operaciones )* ) ) ;
	public final LenguajeUTBParser.condicion_return condicion() throws RecognitionException {
		LenguajeUTBParser.condicion_return retval = new LenguajeUTBParser.condicion_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID155=null;
		Token CONJUNCION159=null;
		Token DISYUNCION160=null;
		ParserRuleReturnScope operaciones156 =null;
		ParserRuleReturnScope op_logicos157 =null;
		ParserRuleReturnScope operaciones158 =null;
		ParserRuleReturnScope operaciones161 =null;
		ParserRuleReturnScope op_logicos162 =null;
		ParserRuleReturnScope operaciones163 =null;

		CommonTree ID155_tree=null;
		CommonTree CONJUNCION159_tree=null;
		CommonTree DISYUNCION160_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:213:11: ( ( ID | ( operaciones op_logicos operaciones ( ( CONJUNCION ^| DISYUNCION ^) operaciones op_logicos operaciones )* ) ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:213:14: ( ID | ( operaciones op_logicos operaciones ( ( CONJUNCION ^| DISYUNCION ^) operaciones op_logicos operaciones )* ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTB.g:213:14: ( ID | ( operaciones op_logicos operaciones ( ( CONJUNCION ^| DISYUNCION ^) operaciones op_logicos operaciones )* ) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==ID) ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1==ENTONCES||LA25_1==92) ) {
					alt25=1;
				}
				else if ( (LA25_1==DIVISION||LA25_1==FALSO||LA25_1==FLOAT||LA25_1==ID||LA25_1==IGUAL_QUE||LA25_1==INT||(LA25_1 >= MAYOR_O_IGUAL_QUE && LA25_1 <= MAYOR_QUE)||(LA25_1 >= MENOR_O_IGUAL_QUE && LA25_1 <= MENOR_QUE)||LA25_1==MODULO||LA25_1==MULTIPLICACION||LA25_1==PARENTECIS_ABRE||LA25_1==RESTA||(LA25_1 >= STRING && LA25_1 <= SUMA)||LA25_1==VERDADERO) ) {
					alt25=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA25_0==FALSO||LA25_0==FLOAT||LA25_0==IGUAL_QUE||LA25_0==INT||(LA25_0 >= MAYOR_O_IGUAL_QUE && LA25_0 <= MAYOR_QUE)||(LA25_0 >= MENOR_O_IGUAL_QUE && LA25_0 <= MENOR_QUE)||LA25_0==PARENTECIS_ABRE||LA25_0==STRING||LA25_0==VERDADERO) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:213:15: ID
					{
					ID155=(Token)match(input,ID,FOLLOW_ID_in_condicion839); 
					ID155_tree = (CommonTree)adaptor.create(ID155);
					adaptor.addChild(root_0, ID155_tree);

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTB.g:213:18: ( operaciones op_logicos operaciones ( ( CONJUNCION ^| DISYUNCION ^) operaciones op_logicos operaciones )* )
					{
					// E:\\Documentos\\to explode\\LenguajeUTB.g:213:18: ( operaciones op_logicos operaciones ( ( CONJUNCION ^| DISYUNCION ^) operaciones op_logicos operaciones )* )
					// E:\\Documentos\\to explode\\LenguajeUTB.g:213:19: operaciones op_logicos operaciones ( ( CONJUNCION ^| DISYUNCION ^) operaciones op_logicos operaciones )*
					{
					pushFollow(FOLLOW_operaciones_in_condicion842);
					operaciones156=operaciones();
					state._fsp--;

					adaptor.addChild(root_0, operaciones156.getTree());

					pushFollow(FOLLOW_op_logicos_in_condicion844);
					op_logicos157=op_logicos();
					state._fsp--;

					adaptor.addChild(root_0, op_logicos157.getTree());

					pushFollow(FOLLOW_operaciones_in_condicion846);
					operaciones158=operaciones();
					state._fsp--;

					adaptor.addChild(root_0, operaciones158.getTree());

					// E:\\Documentos\\to explode\\LenguajeUTB.g:213:54: ( ( CONJUNCION ^| DISYUNCION ^) operaciones op_logicos operaciones )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==CONJUNCION||LA24_0==DISYUNCION) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTB.g:213:55: ( CONJUNCION ^| DISYUNCION ^) operaciones op_logicos operaciones
							{
							// E:\\Documentos\\to explode\\LenguajeUTB.g:213:55: ( CONJUNCION ^| DISYUNCION ^)
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==CONJUNCION) ) {
								alt23=1;
							}
							else if ( (LA23_0==DISYUNCION) ) {
								alt23=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 23, 0, input);
								throw nvae;
							}

							switch (alt23) {
								case 1 :
									// E:\\Documentos\\to explode\\LenguajeUTB.g:213:56: CONJUNCION ^
									{
									CONJUNCION159=(Token)match(input,CONJUNCION,FOLLOW_CONJUNCION_in_condicion850); 
									CONJUNCION159_tree = (CommonTree)adaptor.create(CONJUNCION159);
									root_0 = (CommonTree)adaptor.becomeRoot(CONJUNCION159_tree, root_0);

									}
									break;
								case 2 :
									// E:\\Documentos\\to explode\\LenguajeUTB.g:213:68: DISYUNCION ^
									{
									DISYUNCION160=(Token)match(input,DISYUNCION,FOLLOW_DISYUNCION_in_condicion853); 
									DISYUNCION160_tree = (CommonTree)adaptor.create(DISYUNCION160);
									root_0 = (CommonTree)adaptor.becomeRoot(DISYUNCION160_tree, root_0);

									}
									break;

							}

							pushFollow(FOLLOW_operaciones_in_condicion857);
							operaciones161=operaciones();
							state._fsp--;

							adaptor.addChild(root_0, operaciones161.getTree());

							pushFollow(FOLLOW_op_logicos_in_condicion859);
							op_logicos162=op_logicos();
							state._fsp--;

							adaptor.addChild(root_0, op_logicos162.getTree());

							pushFollow(FOLLOW_operaciones_in_condicion861);
							operaciones163=operaciones();
							state._fsp--;

							adaptor.addChild(root_0, operaciones163.getTree());

							}
							break;

						default :
							break loop24;
						}
					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condicion"


	public static class op_logicos_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "op_logicos"
	// E:\\Documentos\\to explode\\LenguajeUTB.g:215:1: op_logicos : ( IGUAL_QUE | MAYOR_QUE | MENOR_QUE | MAYOR_O_IGUAL_QUE | MENOR_O_IGUAL_QUE ) ;
	public final LenguajeUTBParser.op_logicos_return op_logicos() throws RecognitionException {
		LenguajeUTBParser.op_logicos_return retval = new LenguajeUTBParser.op_logicos_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set164=null;

		CommonTree set164_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTB.g:216:2: ( ( IGUAL_QUE | MAYOR_QUE | MENOR_QUE | MAYOR_O_IGUAL_QUE | MENOR_O_IGUAL_QUE ) )
			// E:\\Documentos\\to explode\\LenguajeUTB.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set164=input.LT(1);
			if ( input.LA(1)==IGUAL_QUE||(input.LA(1) >= MAYOR_O_IGUAL_QUE && input.LA(1) <= MAYOR_QUE)||(input.LA(1) >= MENOR_O_IGUAL_QUE && input.LA(1) <= MENOR_QUE) ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set164));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "op_logicos"

	// Delegated rules



	public static final BitSet FOLLOW_titulo_programa_in_estructura53 = new BitSet(new long[]{0x0000004000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_variables_in_estructura62 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_flujo_in_estructura73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOMBRE_DEL_EJERCICIO_in_titulo_programa83 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_titulo_programa87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLES_in_variables95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_declaracion_in_variables98 = new BitSet(new long[]{0x0000001000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_FIN_VARIABLES_in_variables102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLUJO_in_flujo120 = new BitSet(new long[]{0x1400080108000120L,0x0000000000008008L});
	public static final BitSet FOLLOW_sentencia_in_flujo123 = new BitSet(new long[]{0x1400080108000120L,0x0000000000008008L});
	public static final BitSet FOLLOW_FIN_FLUJO_in_flujo127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_op_decl_in_declaracion146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPO_in_op_decl162 = new BitSet(new long[]{0x0000000001000080L,0x0000000000100800L});
	public static final BitSet FOLLOW_var_in_op_decl165 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DE_in_op_decl167 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_NOMBRE_in_op_decl170 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_op_decl173 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_valor_inicial_in_op_decl176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listas_in_op_decl181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_matriz_in_op_decl186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALOR_INICIAL_in_valor_inicial198 = new BitSet(new long[]{0x0000802080000000L,0x0000000004020000L});
	public static final BitSet FOLLOW_set_in_valor_inicial201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPO_in_listas238 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_LISTA_in_listas241 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DE_in_listas244 = new BitSet(new long[]{0x0000000001000080L,0x0000000000100800L});
	public static final BitSet FOLLOW_var_in_listas247 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_NOMBRE_in_listas249 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_listas252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPO_in_matriz260 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_MATRIZ_in_matriz263 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DE_in_matriz266 = new BitSet(new long[]{0x0000000001000080L,0x0000000000100800L});
	public static final BitSet FOLLOW_var_in_matriz269 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_NOMBRE_in_matriz271 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_matriz274 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DE_in_matriz276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_TAMANO_in_matriz279 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_INT_in_matriz283 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_matriz285 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_INT_in_matriz288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAMBIAR_in_conversion_implicita296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VALOR_in_conversion_implicita299 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DE_in_conversion_implicita302 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_conversion_implicita305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_POR_in_conversion_implicita307 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_conversion_implicita310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAMBIAR_in_conversion_explicita317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VALOR_in_conversion_explicita320 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DE_in_conversion_explicita323 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_conversion_explicita326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_POR_in_conversion_explicita328 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CONVERTIR_in_conversion_explicita331 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_conversion_explicita334 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_conversion_explicita336 = new BitSet(new long[]{0x0000000001000080L,0x0000000000100800L});
	public static final BitSet FOLLOW_var_in_conversion_explicita339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOSTRAR_in_mostrar347 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020000L});
	public static final BitSet FOLLOW_valores_in_mostrar351 = new BitSet(new long[]{0x0000000000010802L,0x0000000000000100L});
	public static final BitSet FOLLOW_COMA_in_mostrar354 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020000L});
	public static final BitSet FOLLOW_valores_in_mostrar356 = new BitSet(new long[]{0x0000000000010802L,0x0000000000000100L});
	public static final BitSet FOLLOW_coor_pos_in_mostrar361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_coor_in_coor_pos408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pos_in_coor_pos410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COORDENADA_in_coor419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_coordenada_in_coor422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POSICION_in_pos429 = new BitSet(new long[]{0x0000880000000000L});
	public static final BitSet FOLLOW_set_in_pos432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operaciones_aritmeticas_in_operaciones447 = new BitSet(new long[]{0x0000882080000002L,0x0000000004020020L});
	public static final BitSet FOLLOW_multiplicacion_in_operaciones_aritmeticas454 = new BitSet(new long[]{0x0000000000000002L,0x0000000000041000L});
	public static final BitSet FOLLOW_SUMA_in_operaciones_aritmeticas458 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020020L});
	public static final BitSet FOLLOW_RESTA_in_operaciones_aritmeticas461 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020020L});
	public static final BitSet FOLLOW_multiplicacion_in_operaciones_aritmeticas465 = new BitSet(new long[]{0x0000000000000002L,0x0000000000041000L});
	public static final BitSet FOLLOW_atom_in_multiplicacion474 = new BitSet(new long[]{0x2800000000400002L});
	public static final BitSet FOLLOW_MULTIPLICACION_in_multiplicacion478 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020020L});
	public static final BitSet FOLLOW_DIVISION_in_multiplicacion481 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020020L});
	public static final BitSet FOLLOW_MODULO_in_multiplicacion484 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020020L});
	public static final BitSet FOLLOW_atom_in_multiplicacion488 = new BitSet(new long[]{0x2800000000400002L});
	public static final BitSet FOLLOW_valor_in_atom498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTECIS_ABRE_in_atom500 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020020L});
	public static final BitSet FOLLOW_operaciones_aritmeticas_in_atom502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PARENTECIS_CIERRA_in_atom504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_LISTAS_in_op_listas548 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_operaciones_listas_in_op_listas551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_agregar_a_lista_in_operaciones_listas559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modificar_de_lista_in_operaciones_listas561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGREGAR_in_agregar_a_lista568 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_agregar_a_lista571 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_agregar_a_lista574 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_agregar_a_lista576 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020000L});
	public static final BitSet FOLLOW_valor_in_agregar_a_lista579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAMBIAR_in_modificar_de_lista586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VALOR_in_modificar_de_lista589 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DE_in_modificar_de_lista592 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_modificar_de_lista595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_POSICION_in_modificar_de_lista597 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020000L});
	public static final BitSet FOLLOW_valor_in_modificar_de_lista599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_POR_in_modificar_de_lista601 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020000L});
	public static final BitSet FOLLOW_valor_in_modificar_de_lista603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_LISTAS_in_op_matrices614 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_operaciones_matrices_in_op_matrices617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modificar_de_matriz_in_operaciones_matrices625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAMBIAR_in_modificar_de_matriz633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VALOR_in_modificar_de_matriz636 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DE_in_modificar_de_matriz639 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_modificar_de_matriz642 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COORDENADA_in_modificar_de_matriz644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_coordenada_in_modificar_de_matriz646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_POR_in_modificar_de_matriz648 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020000L});
	public static final BitSet FOLLOW_valor_in_modificar_de_matriz650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTECIS_ABRE_in_coordenada659 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_INT_in_coordenada663 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_COMA_in_coordenada665 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_INT_in_coordenada668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PARENTECIS_ABRE_in_coordenada671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ESCRIBIR_in_leer683 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_leer686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SI_in_si699 = new BitSet(new long[]{0x0360A82080000000L,0x0000000004020020L});
	public static final BitSet FOLLOW_condicion_in_si702 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ENTONCES_in_si704 = new BitSet(new long[]{0x1400080808000120L,0x0000000000018008L});
	public static final BitSet FOLLOW_sentencia_in_si708 = new BitSet(new long[]{0x1400080808000120L,0x0000000000018008L});
	public static final BitSet FOLLOW_SINO_in_si713 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ENTONCES_in_si715 = new BitSet(new long[]{0x1400080808000120L,0x0000000000018008L});
	public static final BitSet FOLLOW_sentencia_in_si717 = new BitSet(new long[]{0x1400080808000120L,0x0000000000018008L});
	public static final BitSet FOLLOW_FIN_SI_in_si723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MIENTRAS_in_mientras733 = new BitSet(new long[]{0x0360A82080000000L,0x0000000004020020L});
	public static final BitSet FOLLOW_condicion_in_mientras736 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_mientras738 = new BitSet(new long[]{0x1400080208000120L,0x0000000000008008L});
	public static final BitSet FOLLOW_sentencia_in_mientras742 = new BitSet(new long[]{0x1400080208000120L,0x0000000000008008L});
	public static final BitSet FOLLOW_FIN_MIENTRAS_in_mientras747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARA_in_para755 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_para758 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_EN_in_para760 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RANGO_in_para764 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DE_in_para766 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_INT_in_para768 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_para770 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_INT_in_para772 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_para776 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_para779 = new BitSet(new long[]{0x1400080408000120L,0x0000000000008008L});
	public static final BitSet FOLLOW_sentencia_in_para783 = new BitSet(new long[]{0x1400080408000120L,0x0000000000008008L});
	public static final BitSet FOLLOW_FIN_PARA_in_para787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_leer_in_sentencia796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_si_in_sentencia799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mientras_in_sentencia802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_para_in_sentencia805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_sentencia810 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_IGUAL_in_sentencia812 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020020L});
	public static final BitSet FOLLOW_operaciones_in_sentencia815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conversion_implicita_in_sentencia819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conversion_explicita_in_sentencia821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mostrar_in_sentencia824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operaciones_listas_in_sentencia826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operaciones_matrices_in_sentencia828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_condicion839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operaciones_in_condicion842 = new BitSet(new long[]{0x0360200000000000L});
	public static final BitSet FOLLOW_op_logicos_in_condicion844 = new BitSet(new long[]{0x0000882080204000L,0x0000000004020020L});
	public static final BitSet FOLLOW_operaciones_in_condicion846 = new BitSet(new long[]{0x0000000000204002L});
	public static final BitSet FOLLOW_CONJUNCION_in_condicion850 = new BitSet(new long[]{0x0360A82080000000L,0x0000000004020020L});
	public static final BitSet FOLLOW_DISYUNCION_in_condicion853 = new BitSet(new long[]{0x0360A82080000000L,0x0000000004020020L});
	public static final BitSet FOLLOW_operaciones_in_condicion857 = new BitSet(new long[]{0x0360200000000000L});
	public static final BitSet FOLLOW_op_logicos_in_condicion859 = new BitSet(new long[]{0x0000882080204000L,0x0000000004020020L});
	public static final BitSet FOLLOW_operaciones_in_condicion861 = new BitSet(new long[]{0x0000000000204002L});
}
