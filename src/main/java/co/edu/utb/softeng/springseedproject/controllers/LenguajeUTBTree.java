// $ANTLR 3.5.1 E:\\Documentos\\to explode\\LenguajeUTBTree.g 2017-05-29 12:15:59

package co.edu.utb.softeng.springseedproject.controllers;
import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class LenguajeUTBTree extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public LenguajeUTBTree(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public LenguajeUTBTree(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return LenguajeUTBTree.tokenNames; }
	@Override public String getGrammarFileName() { return "E:\\Documentos\\to explode\\LenguajeUTBTree.g"; }


	HashMap<String,String> TablaSimbolos =new HashMap<String,String>();
	List<String> errores = new ArrayList<String>();
	List<int[]> indices = new ArrayList<int[]>();
	verificacion v = new verificacion();
	traduccion t = new traduccion();
	int IndiceVectores[];
	String vectorINFO[];
	String variables = "";
	String flujo = "";



	public static class estructura_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "estructura"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:30:1: estructura : titulo_programa ( variables )? flujo ;
	public final LenguajeUTBTree.estructura_return estructura() throws RecognitionException {
		LenguajeUTBTree.estructura_return retval = new LenguajeUTBTree.estructura_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope titulo_programa1 =null;
		TreeRuleReturnScope variables2 =null;
		TreeRuleReturnScope flujo3 =null;


		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:30:11: ( titulo_programa ( variables )? flujo )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:30:15: titulo_programa ( variables )? flujo
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_titulo_programa_in_estructura50);
			titulo_programa1=titulo_programa();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_0, titulo_programa1.getTree());

			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:30:31: ( variables )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==VARIABLES) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:30:32: variables
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_variables_in_estructura53);
					variables2=variables();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, variables2.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_flujo_in_estructura57);
			flujo3=flujo();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_0, flujo3.getTree());

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "estructura"


	public static class titulo_programa_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "titulo_programa"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:32:1: titulo_programa : ^( NOMBRE_DEL_EJERCICIO ID ) ;
	public final LenguajeUTBTree.titulo_programa_return titulo_programa() throws RecognitionException {
		LenguajeUTBTree.titulo_programa_return retval = new LenguajeUTBTree.titulo_programa_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree NOMBRE_DEL_EJERCICIO4=null;
		CommonTree ID5=null;

		CommonTree NOMBRE_DEL_EJERCICIO4_tree=null;
		CommonTree ID5_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:32:16: ( ^( NOMBRE_DEL_EJERCICIO ID ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:32:19: ^( NOMBRE_DEL_EJERCICIO ID )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			NOMBRE_DEL_EJERCICIO4=(CommonTree)match(input,NOMBRE_DEL_EJERCICIO,FOLLOW_NOMBRE_DEL_EJERCICIO_in_titulo_programa66); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NOMBRE_DEL_EJERCICIO4_tree = (CommonTree)adaptor.dupNode(NOMBRE_DEL_EJERCICIO4);


			root_1 = (CommonTree)adaptor.becomeRoot(NOMBRE_DEL_EJERCICIO4_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_titulo_programa69); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID5_tree = (CommonTree)adaptor.dupNode(ID5);


			adaptor.addChild(root_1, ID5_tree);
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "titulo_programa"


	public static class variables_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variables"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:34:1: variables : ^( VARIABLES ( declaracion )+ ) ;
	public final LenguajeUTBTree.variables_return variables() throws RecognitionException {
		LenguajeUTBTree.variables_return retval = new LenguajeUTBTree.variables_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree VARIABLES6=null;
		TreeRuleReturnScope declaracion7 =null;

		CommonTree VARIABLES6_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:34:10: ( ^( VARIABLES ( declaracion )+ ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:34:12: ^( VARIABLES ( declaracion )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			VARIABLES6=(CommonTree)match(input,VARIABLES,FOLLOW_VARIABLES_in_variables79); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VARIABLES6_tree = (CommonTree)adaptor.dupNode(VARIABLES6);


			root_1 = (CommonTree)adaptor.becomeRoot(VARIABLES6_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:34:24: ( declaracion )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DECLA) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:34:24: declaracion
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_declaracion_in_variables81);
					declaracion7=declaracion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, declaracion7.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variables"


	public static class flujo_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "flujo"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:36:1: flujo : ^( FLUJO ( sentencia )* ) ;
	public final LenguajeUTBTree.flujo_return flujo() throws RecognitionException {
		LenguajeUTBTree.flujo_return retval = new LenguajeUTBTree.flujo_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree FLUJO8=null;
		TreeRuleReturnScope sentencia9 =null;

		CommonTree FLUJO8_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:36:7: ( ^( FLUJO ( sentencia )* ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:36:9: ^( FLUJO ( sentencia )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			FLUJO8=(CommonTree)match(input,FLUJO,FOLLOW_FLUJO_in_flujo95); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FLUJO8_tree = (CommonTree)adaptor.dupNode(FLUJO8);


			root_1 = (CommonTree)adaptor.becomeRoot(FLUJO8_tree, root_1);
			}

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// E:\\Documentos\\to explode\\LenguajeUTBTree.g:36:17: ( sentencia )*
				loop3:
				while (true) {
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==AGREGAR||LA3_0==CAMBIAR||LA3_0==ESCRIBIR||LA3_0==ID||LA3_0==MIENTRAS||LA3_0==MOSTRAR||LA3_0==PARA||LA3_0==SI||LA3_0==VALOR) ) {
						alt3=1;
					}

					switch (alt3) {
					case 1 :
						// E:\\Documentos\\to explode\\LenguajeUTBTree.g:36:18: sentencia
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_sentencia_in_flujo98);
						sentencia9=sentencia();
						state._fsp--;
						if (state.failed) return retval;
						if ( state.backtracking==0 ) 
						adaptor.addChild(root_1, sentencia9.getTree());

						if ( state.backtracking==0 ) {
						}

						}
						break;

					default :
						break loop3;
					}
				}

				match(input, Token.UP, null); if (state.failed) return retval;
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "flujo"


	public static class declaracion_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaracion"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:38:1: declaracion : ^( DECLA op_decla ) ;
	public final LenguajeUTBTree.declaracion_return declaracion() throws RecognitionException {
		LenguajeUTBTree.declaracion_return retval = new LenguajeUTBTree.declaracion_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DECLA10=null;
		TreeRuleReturnScope op_decla11 =null;

		CommonTree DECLA10_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:38:12: ( ^( DECLA op_decla ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:38:15: ^( DECLA op_decla )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			DECLA10=(CommonTree)match(input,DECLA,FOLLOW_DECLA_in_declaracion111); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DECLA10_tree = (CommonTree)adaptor.dupNode(DECLA10);


			root_1 = (CommonTree)adaptor.becomeRoot(DECLA10_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_op_decla_in_declaracion113);
			op_decla11=op_decla();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, op_decla11.getTree());

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaracion"


	public static class op_decla_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "op_decla"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:40:1: op_decla : ( ^( TIPO var a= ID ( valor_inicial )? ) | listas | matriz );
	public final LenguajeUTBTree.op_decla_return op_decla() throws RecognitionException {
		LenguajeUTBTree.op_decla_return retval = new LenguajeUTBTree.op_decla_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree a=null;
		CommonTree TIPO12=null;
		TreeRuleReturnScope var13 =null;
		TreeRuleReturnScope valor_inicial14 =null;
		TreeRuleReturnScope listas15 =null;
		TreeRuleReturnScope matriz16 =null;

		CommonTree a_tree=null;
		CommonTree TIPO12_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:40:9: ( ^( TIPO var a= ID ( valor_inicial )? ) | listas | matriz )
			int alt5=3;
			switch ( input.LA(1) ) {
			case TIPO:
				{
				alt5=1;
				}
				break;
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
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:40:11: ^( TIPO var a= ID ( valor_inicial )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					TIPO12=(CommonTree)match(input,TIPO,FOLLOW_TIPO_in_op_decla123); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIPO12_tree = (CommonTree)adaptor.dupNode(TIPO12);


					root_1 = (CommonTree)adaptor.becomeRoot(TIPO12_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_var_in_op_decla125);
					var13=var();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, var13.getTree());

					_last = (CommonTree)input.LT(1);
					a=(CommonTree)match(input,ID,FOLLOW_ID_in_op_decla129); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					a_tree = (CommonTree)adaptor.dupNode(a);


					adaptor.addChild(root_1, a_tree);
					}

					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:40:27: ( valor_inicial )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==VALOR_INICIAL) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTBTree.g:40:27: valor_inicial
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_valor_inicial_in_op_decla131);
							valor_inicial14=valor_inicial();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, valor_inicial14.getTree());

							if ( state.backtracking==0 ) {
							}

							}
							break;

					}

					if ( state.backtracking==0 ) {
								if(TablaSimbolos.containsKey((a!=null?a.getText():null))){
									errores.add("con el dolor de mi alma te digo que la variable " + (a!=null?a.getText():null) + " ya existe Error: Linea "+(a!=null?a.getLine():0)+"\n");
								}else{
									TablaSimbolos.put((a!=null?a.getText():null),(var13!=null?((LenguajeUTBTree.var_return)var13).tipo:null));
									variables = variables + t.declaracion_datos_primitivos((a!=null?a.getText():null), (var13!=null?((LenguajeUTBTree.var_return)var13).tipo:null), (valor_inicial14!=null?((LenguajeUTBTree.valor_inicial_return)valor_inicial14).valor:null));
								}}
					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:46:8: listas
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_listas_in_op_decla137);
					listas15=listas();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, listas15.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:47:4: matriz
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_matriz_in_op_decla142);
					matriz16=matriz();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, matriz16.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "op_decla"


	public static class valor_inicial_return extends TreeRuleReturnScope {
		public String tipo;
		public String valor;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "valor_inicial"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:51:1: valor_inicial returns [String tipo, String valor] : ^( VALOR_INICIAL ( INT | STRING | FLOAT | ( FALSO | VERDADERO ) ) ) ;
	public final LenguajeUTBTree.valor_inicial_return valor_inicial() throws RecognitionException {
		LenguajeUTBTree.valor_inicial_return retval = new LenguajeUTBTree.valor_inicial_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree VALOR_INICIAL17=null;
		CommonTree INT18=null;
		CommonTree STRING19=null;
		CommonTree FLOAT20=null;
		CommonTree FALSO21=null;
		CommonTree VERDADERO22=null;

		CommonTree VALOR_INICIAL17_tree=null;
		CommonTree INT18_tree=null;
		CommonTree STRING19_tree=null;
		CommonTree FLOAT20_tree=null;
		CommonTree FALSO21_tree=null;
		CommonTree VERDADERO22_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:51:49: ( ^( VALOR_INICIAL ( INT | STRING | FLOAT | ( FALSO | VERDADERO ) ) ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:51:52: ^( VALOR_INICIAL ( INT | STRING | FLOAT | ( FALSO | VERDADERO ) ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			VALOR_INICIAL17=(CommonTree)match(input,VALOR_INICIAL,FOLLOW_VALOR_INICIAL_in_valor_inicial159); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VALOR_INICIAL17_tree = (CommonTree)adaptor.dupNode(VALOR_INICIAL17);


			root_1 = (CommonTree)adaptor.becomeRoot(VALOR_INICIAL17_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:51:68: ( INT | STRING | FLOAT | ( FALSO | VERDADERO ) )
			int alt7=4;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt7=1;
				}
				break;
			case STRING:
				{
				alt7=2;
				}
				break;
			case FLOAT:
				{
				alt7=3;
				}
				break;
			case FALSO:
			case VERDADERO:
				{
				alt7=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:51:69: INT
					{
					_last = (CommonTree)input.LT(1);
					INT18=(CommonTree)match(input,INT,FOLLOW_INT_in_valor_inicial162); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT18_tree = (CommonTree)adaptor.dupNode(INT18);


					adaptor.addChild(root_1, INT18_tree);
					}

					if ( state.backtracking==0 ) {retval.tipo ="entero";retval.valor = (INT18!=null?INT18.getText():null);}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:52:7: STRING
					{
					_last = (CommonTree)input.LT(1);
					STRING19=(CommonTree)match(input,STRING,FOLLOW_STRING_in_valor_inicial171); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING19_tree = (CommonTree)adaptor.dupNode(STRING19);


					adaptor.addChild(root_1, STRING19_tree);
					}

					if ( state.backtracking==0 ) {retval.tipo ="texto"; retval.valor = (STRING19!=null?STRING19.getText():null);}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:53:7: FLOAT
					{
					_last = (CommonTree)input.LT(1);
					FLOAT20=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_valor_inicial180); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT20_tree = (CommonTree)adaptor.dupNode(FLOAT20);


					adaptor.addChild(root_1, FLOAT20_tree);
					}

					if ( state.backtracking==0 ) {retval.tipo ="real"; retval.valor = (FLOAT20!=null?FLOAT20.getText():null);}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:54:7: ( FALSO | VERDADERO )
					{
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:54:7: ( FALSO | VERDADERO )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==FALSO) ) {
						alt6=1;
					}
					else if ( (LA6_0==VERDADERO) ) {
						alt6=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTBTree.g:54:8: FALSO
							{
							_last = (CommonTree)input.LT(1);
							FALSO21=(CommonTree)match(input,FALSO,FOLLOW_FALSO_in_valor_inicial190); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							FALSO21_tree = (CommonTree)adaptor.dupNode(FALSO21);


							adaptor.addChild(root_1, FALSO21_tree);
							}

							if ( state.backtracking==0 ) {retval.tipo ="booleano"; retval.valor = (FALSO21!=null?FALSO21.getText():null);}
							if ( state.backtracking==0 ) {
							}

							}
							break;
						case 2 :
							// E:\\Documentos\\to explode\\LenguajeUTBTree.g:54:56: VERDADERO
							{
							_last = (CommonTree)input.LT(1);
							VERDADERO22=(CommonTree)match(input,VERDADERO,FOLLOW_VERDADERO_in_valor_inicial193); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VERDADERO22_tree = (CommonTree)adaptor.dupNode(VERDADERO22);


							adaptor.addChild(root_1, VERDADERO22_tree);
							}

							if ( state.backtracking==0 ) {retval.tipo ="booleano"; retval.valor = (VERDADERO22!=null?VERDADERO22.getText():null);}
							if ( state.backtracking==0 ) {
							}

							}
							break;

					}

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valor_inicial"


	public static class var_return extends TreeRuleReturnScope {
		public String tipo;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "var"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:56:1: var returns [String tipo] : ( ENTERO | TEXTO | REAL | BOOLEANO ) ;
	public final LenguajeUTBTree.var_return var() throws RecognitionException {
		LenguajeUTBTree.var_return retval = new LenguajeUTBTree.var_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ENTERO23=null;
		CommonTree TEXTO24=null;
		CommonTree REAL25=null;
		CommonTree BOOLEANO26=null;

		CommonTree ENTERO23_tree=null;
		CommonTree TEXTO24_tree=null;
		CommonTree REAL25_tree=null;
		CommonTree BOOLEANO26_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:56:25: ( ( ENTERO | TEXTO | REAL | BOOLEANO ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:56:27: ( ENTERO | TEXTO | REAL | BOOLEANO )
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:56:27: ( ENTERO | TEXTO | REAL | BOOLEANO )
			int alt8=4;
			switch ( input.LA(1) ) {
			case ENTERO:
				{
				alt8=1;
				}
				break;
			case TEXTO:
				{
				alt8=2;
				}
				break;
			case REAL:
				{
				alt8=3;
				}
				break;
			case BOOLEANO:
				{
				alt8=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:56:28: ENTERO
					{
					_last = (CommonTree)input.LT(1);
					ENTERO23=(CommonTree)match(input,ENTERO,FOLLOW_ENTERO_in_var208); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ENTERO23_tree = (CommonTree)adaptor.dupNode(ENTERO23);


					adaptor.addChild(root_0, ENTERO23_tree);
					}

					if ( state.backtracking==0 ) {retval.tipo ="entero";}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:56:52: TEXTO
					{
					_last = (CommonTree)input.LT(1);
					TEXTO24=(CommonTree)match(input,TEXTO,FOLLOW_TEXTO_in_var211); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TEXTO24_tree = (CommonTree)adaptor.dupNode(TEXTO24);


					adaptor.addChild(root_0, TEXTO24_tree);
					}

					if ( state.backtracking==0 ) {retval.tipo ="texto";}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:56:74: REAL
					{
					_last = (CommonTree)input.LT(1);
					REAL25=(CommonTree)match(input,REAL,FOLLOW_REAL_in_var214); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					REAL25_tree = (CommonTree)adaptor.dupNode(REAL25);


					adaptor.addChild(root_0, REAL25_tree);
					}

					if ( state.backtracking==0 ) {retval.tipo ="real";}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:56:94: BOOLEANO
					{
					_last = (CommonTree)input.LT(1);
					BOOLEANO26=(CommonTree)match(input,BOOLEANO,FOLLOW_BOOLEANO_in_var217); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEANO26_tree = (CommonTree)adaptor.dupNode(BOOLEANO26);


					adaptor.addChild(root_0, BOOLEANO26_tree);
					}

					if ( state.backtracking==0 ) {retval.tipo = "booleano";}
					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var"


	public static class listas_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "listas"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:61:1: listas : ^( LISTA var ID ) ;
	public final LenguajeUTBTree.listas_return listas() throws RecognitionException {
		LenguajeUTBTree.listas_return retval = new LenguajeUTBTree.listas_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree LISTA27=null;
		CommonTree ID29=null;
		TreeRuleReturnScope var28 =null;

		CommonTree LISTA27_tree=null;
		CommonTree ID29_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:61:8: ( ^( LISTA var ID ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:61:11: ^( LISTA var ID )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			LISTA27=(CommonTree)match(input,LISTA,FOLLOW_LISTA_in_listas232); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LISTA27_tree = (CommonTree)adaptor.dupNode(LISTA27);


			root_1 = (CommonTree)adaptor.becomeRoot(LISTA27_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_var_in_listas234);
			var28=var();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, var28.getTree());

			_last = (CommonTree)input.LT(1);
			ID29=(CommonTree)match(input,ID,FOLLOW_ID_in_listas237); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID29_tree = (CommonTree)adaptor.dupNode(ID29);


			adaptor.addChild(root_1, ID29_tree);
			}

			if ( state.backtracking==0 ) {
						if(TablaSimbolos.containsKey((ID29!=null?ID29.getText():null))){
							errores.add("con el dolor de mi alma te digo que la variable " + (ID29!=null?ID29.getText():null) + " ya existe Error: Linea "+(ID29!=null?ID29.getLine():0)+"\n");
						}else{
							TablaSimbolos.put((ID29!=null?ID29.getText():null) , (var28!=null?((LenguajeUTBTree.var_return)var28).tipo:null));
							variables = variables + t.declaracion_listas((ID29!=null?ID29.getText():null), (var28!=null?((LenguajeUTBTree.var_return)var28).tipo:null));	
						}}
			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "listas"


	public static class matriz_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "matriz"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:70:1: matriz : ^( MATRIZ var ID (b= INT c= INT ) ) ;
	public final LenguajeUTBTree.matriz_return matriz() throws RecognitionException {
		LenguajeUTBTree.matriz_return retval = new LenguajeUTBTree.matriz_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree b=null;
		CommonTree c=null;
		CommonTree MATRIZ30=null;
		CommonTree ID32=null;
		TreeRuleReturnScope var31 =null;

		CommonTree b_tree=null;
		CommonTree c_tree=null;
		CommonTree MATRIZ30_tree=null;
		CommonTree ID32_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:70:8: ( ^( MATRIZ var ID (b= INT c= INT ) ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:70:10: ^( MATRIZ var ID (b= INT c= INT ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			MATRIZ30=(CommonTree)match(input,MATRIZ,FOLLOW_MATRIZ_in_matriz250); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			MATRIZ30_tree = (CommonTree)adaptor.dupNode(MATRIZ30);


			root_1 = (CommonTree)adaptor.becomeRoot(MATRIZ30_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_var_in_matriz252);
			var31=var();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, var31.getTree());

			_last = (CommonTree)input.LT(1);
			ID32=(CommonTree)match(input,ID,FOLLOW_ID_in_matriz255); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID32_tree = (CommonTree)adaptor.dupNode(ID32);


			adaptor.addChild(root_1, ID32_tree);
			}

			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:70:26: (b= INT c= INT )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:70:27: b= INT c= INT
			{
			_last = (CommonTree)input.LT(1);
			b=(CommonTree)match(input,INT,FOLLOW_INT_in_matriz259); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			b_tree = (CommonTree)adaptor.dupNode(b);


			adaptor.addChild(root_1, b_tree);
			}

			_last = (CommonTree)input.LT(1);
			c=(CommonTree)match(input,INT,FOLLOW_INT_in_matriz263); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			c_tree = (CommonTree)adaptor.dupNode(c);


			adaptor.addChild(root_1, c_tree);
			}

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {
						if(TablaSimbolos.containsKey((ID32!=null?ID32.getText():null))){
							
							errores.add("con el dolor de mi alma te digo que la variable " + (ID32!=null?ID32.getText():null) + " ya existe Error: Linea "+(ID32!=null?ID32.getLine():0)+"\n");
						}else{
							TablaSimbolos.put((ID32!=null?ID32.getText():null) , (var31!=null?((LenguajeUTBTree.var_return)var31).tipo:null));
							IndiceVectores = new int[3];
							vectorINFO = new String[1];
							vectorINFO[0] = (ID32!=null?ID32.getText():null);
							IndiceVectores[0]= Integer.parseInt((b!=null?b.getText():null));
							IndiceVectores[1]= Integer.parseInt((c!=null?c.getText():null));
							IndiceVectores[2]= (Integer.parseInt((b!=null?b.getText():null)) * Integer.parseInt((c!=null?c.getText():null))) ;
							indices.add(IndiceVectores);
							variables = variables + t.declaracion_matrices((ID32!=null?ID32.getText():null),TablaSimbolos.get((ID32!=null?ID32.getText():null)),IndiceVectores[2]);
						
						}}
			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "matriz"


	public static class conversion_implicita_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conversion_implicita"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:89:1: conversion_implicita : ^( VALOR a= ID b= ID ) ;
	public final LenguajeUTBTree.conversion_implicita_return conversion_implicita() throws RecognitionException {
		LenguajeUTBTree.conversion_implicita_return retval = new LenguajeUTBTree.conversion_implicita_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree a=null;
		CommonTree b=null;
		CommonTree VALOR33=null;

		CommonTree a_tree=null;
		CommonTree b_tree=null;
		CommonTree VALOR33_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:89:21: ( ^( VALOR a= ID b= ID ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:89:23: ^( VALOR a= ID b= ID )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			VALOR33=(CommonTree)match(input,VALOR,FOLLOW_VALOR_in_conversion_implicita280); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VALOR33_tree = (CommonTree)adaptor.dupNode(VALOR33);


			root_1 = (CommonTree)adaptor.becomeRoot(VALOR33_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			a=(CommonTree)match(input,ID,FOLLOW_ID_in_conversion_implicita284); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			a_tree = (CommonTree)adaptor.dupNode(a);


			adaptor.addChild(root_1, a_tree);
			}

			_last = (CommonTree)input.LT(1);
			b=(CommonTree)match(input,ID,FOLLOW_ID_in_conversion_implicita288); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			b_tree = (CommonTree)adaptor.dupNode(b);


			adaptor.addChild(root_1, b_tree);
			}

			if ( state.backtracking==0 ) {
			if(TablaSimbolos.containsKey((a!=null?a.getText():null)) && TablaSimbolos.containsKey((b!=null?b.getText():null))){
				String nuevo = TablaSimbolos.get((b!=null?b.getText():null));
				TablaSimbolos.put((a!=null?a.getText():null), nuevo);
			}else{
				errores.add("la variable No existe, linea: " + (a!=null?a.getLine():0));
			}
			}
			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conversion_implicita"


	public static class conversion_explicita_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conversion_explicita"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:97:1: conversion_explicita : ^( VALOR ID a= ID var ) ;
	public final LenguajeUTBTree.conversion_explicita_return conversion_explicita() throws RecognitionException {
		LenguajeUTBTree.conversion_explicita_return retval = new LenguajeUTBTree.conversion_explicita_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree a=null;
		CommonTree VALOR34=null;
		CommonTree ID35=null;
		TreeRuleReturnScope var36 =null;

		CommonTree a_tree=null;
		CommonTree VALOR34_tree=null;
		CommonTree ID35_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:97:21: ( ^( VALOR ID a= ID var ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:97:23: ^( VALOR ID a= ID var )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			VALOR34=(CommonTree)match(input,VALOR,FOLLOW_VALOR_in_conversion_explicita299); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VALOR34_tree = (CommonTree)adaptor.dupNode(VALOR34);


			root_1 = (CommonTree)adaptor.becomeRoot(VALOR34_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			ID35=(CommonTree)match(input,ID,FOLLOW_ID_in_conversion_explicita301); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID35_tree = (CommonTree)adaptor.dupNode(ID35);


			adaptor.addChild(root_1, ID35_tree);
			}

			_last = (CommonTree)input.LT(1);
			a=(CommonTree)match(input,ID,FOLLOW_ID_in_conversion_explicita305); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			a_tree = (CommonTree)adaptor.dupNode(a);


			adaptor.addChild(root_1, a_tree);
			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_var_in_conversion_explicita308);
			var36=var();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, var36.getTree());

			if ( state.backtracking==0 ) {
			if(TablaSimbolos.containsKey((a!=null?a.getText():null))){
				TablaSimbolos.put((a!=null?a.getText():null), (var36!=null?((LenguajeUTBTree.var_return)var36).tipo:null));
			}else{
			errores.add("la variable " + (a!=null?a.getText():null) + " No extist, linea: " + (a!=null?a.getLine():0));
			}
			}
			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conversion_explicita"


	public static class operaciones_return extends TreeRuleReturnScope {
		public String tipo;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operaciones"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:106:1: operaciones returns [String tipo] : ( ^( SUMA a= operaciones b= operaciones ) | ^( RESTA a= operaciones b= operaciones ) | ^( MULTIPLICACION a= operaciones b= operaciones ) | ^( DIVISION a= operaciones b= operaciones ) | ^( MODULO a= operaciones b= operaciones ) | valor | ^( EXPRESIONES a= operaciones ) );
	public final LenguajeUTBTree.operaciones_return operaciones() throws RecognitionException {
		LenguajeUTBTree.operaciones_return retval = new LenguajeUTBTree.operaciones_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree SUMA37=null;
		CommonTree RESTA38=null;
		CommonTree MULTIPLICACION39=null;
		CommonTree DIVISION40=null;
		CommonTree MODULO41=null;
		CommonTree EXPRESIONES43=null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope b =null;
		TreeRuleReturnScope valor42 =null;

		CommonTree SUMA37_tree=null;
		CommonTree RESTA38_tree=null;
		CommonTree MULTIPLICACION39_tree=null;
		CommonTree DIVISION40_tree=null;
		CommonTree MODULO41_tree=null;
		CommonTree EXPRESIONES43_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:106:33: ( ^( SUMA a= operaciones b= operaciones ) | ^( RESTA a= operaciones b= operaciones ) | ^( MULTIPLICACION a= operaciones b= operaciones ) | ^( DIVISION a= operaciones b= operaciones ) | ^( MODULO a= operaciones b= operaciones ) | valor | ^( EXPRESIONES a= operaciones ) )
			int alt9=7;
			switch ( input.LA(1) ) {
			case SUMA:
				{
				alt9=1;
				}
				break;
			case RESTA:
				{
				alt9=2;
				}
				break;
			case MULTIPLICACION:
				{
				alt9=3;
				}
				break;
			case DIVISION:
				{
				alt9=4;
				}
				break;
			case MODULO:
				{
				alt9=5;
				}
				break;
			case FALSO:
			case FLOAT:
			case ID:
			case INT:
			case STRING:
			case VERDADERO:
				{
				alt9=6;
				}
				break;
			case EXPRESIONES:
				{
				alt9=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:107:4: ^( SUMA a= operaciones b= operaciones )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					SUMA37=(CommonTree)match(input,SUMA,FOLLOW_SUMA_in_operaciones326); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SUMA37_tree = (CommonTree)adaptor.dupNode(SUMA37);


					root_1 = (CommonTree)adaptor.becomeRoot(SUMA37_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_operaciones330);
					a=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, a.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_operaciones334);
					b=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, b.getTree());

					if ( state.backtracking==0 ) {retval.tipo =v.verificarTipo((a!=null?((LenguajeUTBTree.operaciones_return)a).tipo:null), (SUMA37!=null?SUMA37.getText():null) ,(b!=null?((LenguajeUTBTree.operaciones_return)b).tipo:null));}
					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:108:5: ^( RESTA a= operaciones b= operaciones )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					RESTA38=(CommonTree)match(input,RESTA,FOLLOW_RESTA_in_operaciones343); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RESTA38_tree = (CommonTree)adaptor.dupNode(RESTA38);


					root_1 = (CommonTree)adaptor.becomeRoot(RESTA38_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_operaciones347);
					a=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, a.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_operaciones351);
					b=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, b.getTree());

					if ( state.backtracking==0 ) {retval.tipo =v.verificarTipo((a!=null?((LenguajeUTBTree.operaciones_return)a).tipo:null), (RESTA38!=null?RESTA38.getText():null) ,(b!=null?((LenguajeUTBTree.operaciones_return)b).tipo:null));}
					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:109:5: ^( MULTIPLICACION a= operaciones b= operaciones )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MULTIPLICACION39=(CommonTree)match(input,MULTIPLICACION,FOLLOW_MULTIPLICACION_in_operaciones360); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MULTIPLICACION39_tree = (CommonTree)adaptor.dupNode(MULTIPLICACION39);


					root_1 = (CommonTree)adaptor.becomeRoot(MULTIPLICACION39_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_operaciones364);
					a=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, a.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_operaciones368);
					b=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, b.getTree());

					if ( state.backtracking==0 ) {retval.tipo = v.verificarTipo((a!=null?((LenguajeUTBTree.operaciones_return)a).tipo:null), (MULTIPLICACION39!=null?MULTIPLICACION39.getText():null) ,(b!=null?((LenguajeUTBTree.operaciones_return)b).tipo:null));}
					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:110:5: ^( DIVISION a= operaciones b= operaciones )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DIVISION40=(CommonTree)match(input,DIVISION,FOLLOW_DIVISION_in_operaciones377); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DIVISION40_tree = (CommonTree)adaptor.dupNode(DIVISION40);


					root_1 = (CommonTree)adaptor.becomeRoot(DIVISION40_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_operaciones381);
					a=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, a.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_operaciones385);
					b=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, b.getTree());

					if ( state.backtracking==0 ) {retval.tipo =v.verificarTipo((a!=null?((LenguajeUTBTree.operaciones_return)a).tipo:null), (DIVISION40!=null?DIVISION40.getText():null) ,(b!=null?((LenguajeUTBTree.operaciones_return)b).tipo:null));}
					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 5 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:111:5: ^( MODULO a= operaciones b= operaciones )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MODULO41=(CommonTree)match(input,MODULO,FOLLOW_MODULO_in_operaciones394); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MODULO41_tree = (CommonTree)adaptor.dupNode(MODULO41);


					root_1 = (CommonTree)adaptor.becomeRoot(MODULO41_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_operaciones398);
					a=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, a.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_operaciones402);
					b=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, b.getTree());

					if ( state.backtracking==0 ) {retval.tipo =v.verificarTipo((a!=null?((LenguajeUTBTree.operaciones_return)a).tipo:null), (MODULO41!=null?MODULO41.getText():null) ,(b!=null?((LenguajeUTBTree.operaciones_return)b).tipo:null));}
					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 6 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:112:5: valor
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_valor_in_operaciones410);
					valor42=valor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, valor42.getTree());

					if ( state.backtracking==0 ) { retval.tipo =(valor42!=null?((LenguajeUTBTree.valor_return)valor42).tipo:null);}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 7 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:113:5: ^( EXPRESIONES a= operaciones )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					EXPRESIONES43=(CommonTree)match(input,EXPRESIONES,FOLLOW_EXPRESIONES_in_operaciones418); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXPRESIONES43_tree = (CommonTree)adaptor.dupNode(EXPRESIONES43);


					root_1 = (CommonTree)adaptor.becomeRoot(EXPRESIONES43_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_operaciones422);
					a=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, a.getTree());

					if ( state.backtracking==0 ) {retval.tipo = (a!=null?((LenguajeUTBTree.operaciones_return)a).tipo:null); }
					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operaciones"


	public static class valor_return extends TreeRuleReturnScope {
		public String tipo;
		public String valor2;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "valor"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:114:1: valor returns [String tipo, String valor2 ] : ( ID | STRING | INT | FLOAT | ( VERDADERO | FALSO ) );
	public final LenguajeUTBTree.valor_return valor() throws RecognitionException {
		LenguajeUTBTree.valor_return retval = new LenguajeUTBTree.valor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ID44=null;
		CommonTree STRING45=null;
		CommonTree INT46=null;
		CommonTree FLOAT47=null;
		CommonTree VERDADERO48=null;
		CommonTree FALSO49=null;

		CommonTree ID44_tree=null;
		CommonTree STRING45_tree=null;
		CommonTree INT46_tree=null;
		CommonTree FLOAT47_tree=null;
		CommonTree VERDADERO48_tree=null;
		CommonTree FALSO49_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:114:44: ( ID | STRING | INT | FLOAT | ( VERDADERO | FALSO ) )
			int alt11=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt11=1;
				}
				break;
			case STRING:
				{
				alt11=2;
				}
				break;
			case INT:
				{
				alt11=3;
				}
				break;
			case FLOAT:
				{
				alt11=4;
				}
				break;
			case FALSO:
			case VERDADERO:
				{
				alt11=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:114:46: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					ID44=(CommonTree)match(input,ID,FOLLOW_ID_in_valor434); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID44_tree = (CommonTree)adaptor.dupNode(ID44);


					adaptor.addChild(root_0, ID44_tree);
					}

					if ( state.backtracking==0 ) {retval.tipo =TablaSimbolos.get((ID44!=null?ID44.getText():null)); retval.valor2 = (ID44!=null?ID44.getText():null);}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:115:8: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					STRING45=(CommonTree)match(input,STRING,FOLLOW_STRING_in_valor444); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING45_tree = (CommonTree)adaptor.dupNode(STRING45);


					adaptor.addChild(root_0, STRING45_tree);
					}

					if ( state.backtracking==0 ) {retval.tipo ="texto"; retval.valor2 = (STRING45!=null?STRING45.getText():null);}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:116:8: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					INT46=(CommonTree)match(input,INT,FOLLOW_INT_in_valor454); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT46_tree = (CommonTree)adaptor.dupNode(INT46);


					adaptor.addChild(root_0, INT46_tree);
					}

					if ( state.backtracking==0 ) {retval.tipo ="entero"; retval.valor2 = (INT46!=null?INT46.getText():null);}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:117:8: FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					FLOAT47=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_valor464); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT47_tree = (CommonTree)adaptor.dupNode(FLOAT47);


					adaptor.addChild(root_0, FLOAT47_tree);
					}

					if ( state.backtracking==0 ) {retval.tipo ="real"; retval.valor2 = (FLOAT47!=null?FLOAT47.getText():null);}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 5 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:117:52: ( VERDADERO | FALSO )
					{
					root_0 = (CommonTree)adaptor.nil();


					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:117:52: ( VERDADERO | FALSO )
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==VERDADERO) ) {
						alt10=1;
					}
					else if ( (LA10_0==FALSO) ) {
						alt10=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTBTree.g:117:53: VERDADERO
							{
							_last = (CommonTree)input.LT(1);
							VERDADERO48=(CommonTree)match(input,VERDADERO,FOLLOW_VERDADERO_in_valor468); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VERDADERO48_tree = (CommonTree)adaptor.dupNode(VERDADERO48);


							adaptor.addChild(root_0, VERDADERO48_tree);
							}

							if ( state.backtracking==0 ) { retval.valor2 = (VERDADERO48!=null?VERDADERO48.getText():null);}
							if ( state.backtracking==0 ) {
							}

							}
							break;
						case 2 :
							// E:\\Documentos\\to explode\\LenguajeUTBTree.g:117:92: FALSO
							{
							_last = (CommonTree)input.LT(1);
							FALSO49=(CommonTree)match(input,FALSO,FOLLOW_FALSO_in_valor471); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							FALSO49_tree = (CommonTree)adaptor.dupNode(FALSO49);


							adaptor.addChild(root_0, FALSO49_tree);
							}

							if ( state.backtracking==0 ) { retval.valor2 = (FALSO49!=null?FALSO49.getText():null);}
							if ( state.backtracking==0 ) {
							}

							}
							break;

					}

					if ( state.backtracking==0 ) {retval.tipo ="booleano";}
					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valor"


	public static class op_listas_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "op_listas"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:120:1: op_listas : ^( OP_LISTAS operaciones_listas ) ;
	public final LenguajeUTBTree.op_listas_return op_listas() throws RecognitionException {
		LenguajeUTBTree.op_listas_return retval = new LenguajeUTBTree.op_listas_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree OP_LISTAS50=null;
		TreeRuleReturnScope operaciones_listas51 =null;

		CommonTree OP_LISTAS50_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:120:19: ( ^( OP_LISTAS operaciones_listas ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:120:21: ^( OP_LISTAS operaciones_listas )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			OP_LISTAS50=(CommonTree)match(input,OP_LISTAS,FOLLOW_OP_LISTAS_in_op_listas492); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			OP_LISTAS50_tree = (CommonTree)adaptor.dupNode(OP_LISTAS50);


			root_1 = (CommonTree)adaptor.becomeRoot(OP_LISTAS50_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_operaciones_listas_in_op_listas494);
			operaciones_listas51=operaciones_listas();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, operaciones_listas51.getTree());

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "op_listas"


	public static class operaciones_listas_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operaciones_listas"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:121:1: operaciones_listas : ( agregar_a_lista | modificar_de_lista ) ;
	public final LenguajeUTBTree.operaciones_listas_return operaciones_listas() throws RecognitionException {
		LenguajeUTBTree.operaciones_listas_return retval = new LenguajeUTBTree.operaciones_listas_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope agregar_a_lista52 =null;
		TreeRuleReturnScope modificar_de_lista53 =null;


		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:121:19: ( ( agregar_a_lista | modificar_de_lista ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:121:21: ( agregar_a_lista | modificar_de_lista )
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:121:21: ( agregar_a_lista | modificar_de_lista )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==AGREGAR) ) {
				alt12=1;
			}
			else if ( (LA12_0==CAMBIAR) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:121:22: agregar_a_lista
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_agregar_a_lista_in_operaciones_listas502);
					agregar_a_lista52=agregar_a_lista();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, agregar_a_lista52.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:121:38: modificar_de_lista
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_modificar_de_lista_in_operaciones_listas504);
					modificar_de_lista53=modificar_de_lista();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, modificar_de_lista53.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operaciones_listas"


	public static class agregar_a_lista_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "agregar_a_lista"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:125:1: agregar_a_lista : ^( AGREGAR ID valor ) ;
	public final LenguajeUTBTree.agregar_a_lista_return agregar_a_lista() throws RecognitionException {
		LenguajeUTBTree.agregar_a_lista_return retval = new LenguajeUTBTree.agregar_a_lista_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree AGREGAR54=null;
		CommonTree ID55=null;
		TreeRuleReturnScope valor56 =null;

		CommonTree AGREGAR54_tree=null;
		CommonTree ID55_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:125:16: ( ^( AGREGAR ID valor ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:125:18: ^( AGREGAR ID valor )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			AGREGAR54=(CommonTree)match(input,AGREGAR,FOLLOW_AGREGAR_in_agregar_a_lista515); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			AGREGAR54_tree = (CommonTree)adaptor.dupNode(AGREGAR54);


			root_1 = (CommonTree)adaptor.becomeRoot(AGREGAR54_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			ID55=(CommonTree)match(input,ID,FOLLOW_ID_in_agregar_a_lista518); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID55_tree = (CommonTree)adaptor.dupNode(ID55);


			adaptor.addChild(root_1, ID55_tree);
			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_valor_in_agregar_a_lista521);
			valor56=valor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, valor56.getTree());

			if ( state.backtracking==0 ) {
						if(TablaSimbolos.containsKey((ID55!=null?ID55.getText():null))){
							if(TablaSimbolos.get((ID55!=null?ID55.getText():null)) == (valor56!=null?((LenguajeUTBTree.valor_return)valor56).tipo:null)){
								flujo = flujo + t.agregar_a_lista((ID55!=null?ID55.getText():null), (valor56!=null?((LenguajeUTBTree.valor_return)valor56).tipo:null), (valor56!=null?((LenguajeUTBTree.valor_return)valor56).valor2:null));
							}else{
								errores.add("Tipos incompatibles , Linea "+(ID55!=null?ID55.getLine():0)+"\n");
							}
							
						}else{
							
							errores.add("con el dolor de mi alma te digo que la lista " + (ID55!=null?ID55.getText():null) + " no existe Error: Linea "+(ID55!=null?ID55.getLine():0)+"\n");
						}
						

			}
			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "agregar_a_lista"


	public static class modificar_de_lista_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "modificar_de_lista"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:142:1: modificar_de_lista : ^( CAMBIAR ID POSICION a= valor POR b= valor ) ;
	public final LenguajeUTBTree.modificar_de_lista_return modificar_de_lista() throws RecognitionException {
		LenguajeUTBTree.modificar_de_lista_return retval = new LenguajeUTBTree.modificar_de_lista_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree CAMBIAR57=null;
		CommonTree ID58=null;
		CommonTree POSICION59=null;
		CommonTree POR60=null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope b =null;

		CommonTree CAMBIAR57_tree=null;
		CommonTree ID58_tree=null;
		CommonTree POSICION59_tree=null;
		CommonTree POR60_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:142:19: ( ^( CAMBIAR ID POSICION a= valor POR b= valor ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:142:21: ^( CAMBIAR ID POSICION a= valor POR b= valor )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			CAMBIAR57=(CommonTree)match(input,CAMBIAR,FOLLOW_CAMBIAR_in_modificar_de_lista534); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CAMBIAR57_tree = (CommonTree)adaptor.dupNode(CAMBIAR57);


			root_1 = (CommonTree)adaptor.becomeRoot(CAMBIAR57_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			ID58=(CommonTree)match(input,ID,FOLLOW_ID_in_modificar_de_lista536); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID58_tree = (CommonTree)adaptor.dupNode(ID58);


			adaptor.addChild(root_1, ID58_tree);
			}

			_last = (CommonTree)input.LT(1);
			POSICION59=(CommonTree)match(input,POSICION,FOLLOW_POSICION_in_modificar_de_lista538); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			POSICION59_tree = (CommonTree)adaptor.dupNode(POSICION59);


			adaptor.addChild(root_1, POSICION59_tree);
			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_valor_in_modificar_de_lista542);
			a=valor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, a.getTree());

			_last = (CommonTree)input.LT(1);
			POR60=(CommonTree)match(input,POR,FOLLOW_POR_in_modificar_de_lista544); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			POR60_tree = (CommonTree)adaptor.dupNode(POR60);


			adaptor.addChild(root_1, POR60_tree);
			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_valor_in_modificar_de_lista548);
			b=valor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, b.getTree());

			if ( state.backtracking==0 ) {
					if(TablaSimbolos.containsKey((ID58!=null?ID58.getText():null))){
							if(TablaSimbolos.get((ID58!=null?ID58.getText():null)) == (b!=null?((LenguajeUTBTree.valor_return)b).tipo:null)){
								flujo = flujo + t.modificar_lista((ID58!=null?ID58.getText():null), (b!=null?((LenguajeUTBTree.valor_return)b).tipo:null), Integer.parseInt((a!=null?((LenguajeUTBTree.valor_return)a).valor2:null)), (b!=null?((LenguajeUTBTree.valor_return)b).valor2:null));
							}else{
								errores.add("Tipos incompatibles , Linea "+(ID58!=null?ID58.getLine():0)+"\n");
							}
							
						}else{
							errores.add("con el dolor de mi alma te digo que la lista " + (ID58!=null?ID58.getText():null) + " ya existe Error: Linea "+(ID58!=null?ID58.getLine():0)+"\n");
						}
				}
			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modificar_de_lista"


	public static class op_matrices_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "op_matrices"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:157:1: op_matrices : ^( OP_LISTAS operaciones_matrices ) ;
	public final LenguajeUTBTree.op_matrices_return op_matrices() throws RecognitionException {
		LenguajeUTBTree.op_matrices_return retval = new LenguajeUTBTree.op_matrices_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree OP_LISTAS61=null;
		TreeRuleReturnScope operaciones_matrices62 =null;

		CommonTree OP_LISTAS61_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:157:12: ( ^( OP_LISTAS operaciones_matrices ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:157:15: ^( OP_LISTAS operaciones_matrices )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			OP_LISTAS61=(CommonTree)match(input,OP_LISTAS,FOLLOW_OP_LISTAS_in_op_matrices561); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			OP_LISTAS61_tree = (CommonTree)adaptor.dupNode(OP_LISTAS61);


			root_1 = (CommonTree)adaptor.becomeRoot(OP_LISTAS61_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_operaciones_matrices_in_op_matrices563);
			operaciones_matrices62=operaciones_matrices();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, operaciones_matrices62.getTree());

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "op_matrices"


	public static class operaciones_matrices_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operaciones_matrices"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:158:1: operaciones_matrices : modificar_de_matriz ;
	public final LenguajeUTBTree.operaciones_matrices_return operaciones_matrices() throws RecognitionException {
		LenguajeUTBTree.operaciones_matrices_return retval = new LenguajeUTBTree.operaciones_matrices_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope modificar_de_matriz63 =null;


		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:158:21: ( modificar_de_matriz )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:158:23: modificar_de_matriz
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_modificar_de_matriz_in_operaciones_matrices571);
			modificar_de_matriz63=modificar_de_matriz();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_0, modificar_de_matriz63.getTree());

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operaciones_matrices"


	public static class modificar_de_matriz_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "modificar_de_matriz"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:160:1: modificar_de_matriz : ^( CAMBIAR ID COORDENADA coordenada POR valor ) ;
	public final LenguajeUTBTree.modificar_de_matriz_return modificar_de_matriz() throws RecognitionException {
		LenguajeUTBTree.modificar_de_matriz_return retval = new LenguajeUTBTree.modificar_de_matriz_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree CAMBIAR64=null;
		CommonTree ID65=null;
		CommonTree COORDENADA66=null;
		CommonTree POR68=null;
		TreeRuleReturnScope coordenada67 =null;
		TreeRuleReturnScope valor69 =null;

		CommonTree CAMBIAR64_tree=null;
		CommonTree ID65_tree=null;
		CommonTree COORDENADA66_tree=null;
		CommonTree POR68_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:160:20: ( ^( CAMBIAR ID COORDENADA coordenada POR valor ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:160:23: ^( CAMBIAR ID COORDENADA coordenada POR valor )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			CAMBIAR64=(CommonTree)match(input,CAMBIAR,FOLLOW_CAMBIAR_in_modificar_de_matriz580); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CAMBIAR64_tree = (CommonTree)adaptor.dupNode(CAMBIAR64);


			root_1 = (CommonTree)adaptor.becomeRoot(CAMBIAR64_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			ID65=(CommonTree)match(input,ID,FOLLOW_ID_in_modificar_de_matriz582); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID65_tree = (CommonTree)adaptor.dupNode(ID65);


			adaptor.addChild(root_1, ID65_tree);
			}

			_last = (CommonTree)input.LT(1);
			COORDENADA66=(CommonTree)match(input,COORDENADA,FOLLOW_COORDENADA_in_modificar_de_matriz584); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COORDENADA66_tree = (CommonTree)adaptor.dupNode(COORDENADA66);


			adaptor.addChild(root_1, COORDENADA66_tree);
			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_coordenada_in_modificar_de_matriz586);
			coordenada67=coordenada();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, coordenada67.getTree());

			_last = (CommonTree)input.LT(1);
			POR68=(CommonTree)match(input,POR,FOLLOW_POR_in_modificar_de_matriz588); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			POR68_tree = (CommonTree)adaptor.dupNode(POR68);


			adaptor.addChild(root_1, POR68_tree);
			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_valor_in_modificar_de_matriz590);
			valor69=valor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, valor69.getTree());

			if ( state.backtracking==0 ) {
						if(TablaSimbolos.containsKey((ID65!=null?ID65.getText():null))){
							if(TablaSimbolos.get((ID65!=null?ID65.getText():null)) == (valor69!=null?((LenguajeUTBTree.valor_return)valor69).tipo:null)){
								String m = v.verificarIndices(indices,vectorINFO, (ID65!=null?ID65.getText():null), (coordenada67!=null?((LenguajeUTBTree.coordenada_return)coordenada67).ind1:0), (coordenada67!=null?((LenguajeUTBTree.coordenada_return)coordenada67).ind2:0));
								if(m!=""){
									errores.add(m + " "+ (ID65!=null?ID65.getLine():0));
								}else{
								//modificar matriz
								}
							}else{
								
								errores.add("Tipos incompatibles , Linea "+(ID65!=null?ID65.getLine():0)+"\n");
							}
							
						}else{
							errores.add("con el dolor de mi alma te digo que la matriz " + (ID65!=null?ID65.getText():null) + " ya existe Error: Linea "+(ID65!=null?ID65.getLine():0)+"\n");
						}}
			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modificar_de_matriz"


	public static class coordenada_return extends TreeRuleReturnScope {
		public int ind1;
		public int ind2;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "coordenada"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:178:1: coordenada returns [int ind1, int ind2] : (a= INT b= INT ) ;
	public final LenguajeUTBTree.coordenada_return coordenada() throws RecognitionException {
		LenguajeUTBTree.coordenada_return retval = new LenguajeUTBTree.coordenada_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree a=null;
		CommonTree b=null;

		CommonTree a_tree=null;
		CommonTree b_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:178:40: ( (a= INT b= INT ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:178:45: (a= INT b= INT )
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:178:45: (a= INT b= INT )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:178:46: a= INT b= INT
			{
			_last = (CommonTree)input.LT(1);
			a=(CommonTree)match(input,INT,FOLLOW_INT_in_coordenada609); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			a_tree = (CommonTree)adaptor.dupNode(a);


			adaptor.addChild(root_0, a_tree);
			}

			_last = (CommonTree)input.LT(1);
			b=(CommonTree)match(input,INT,FOLLOW_INT_in_coordenada613); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			b_tree = (CommonTree)adaptor.dupNode(b);


			adaptor.addChild(root_0, b_tree);
			}

			if ( state.backtracking==0 ) {
				retval.ind1 = Integer.parseInt((a!=null?a.getText():null));
				retval.ind2 = Integer.parseInt((b!=null?b.getText():null));	
			}
			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "coordenada"


	public static class mostrar_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mostrar"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:187:1: mostrar : ^( MOSTRAR ( valores ( coor_pos )? )+ ) ;
	public final LenguajeUTBTree.mostrar_return mostrar() throws RecognitionException {
		LenguajeUTBTree.mostrar_return retval = new LenguajeUTBTree.mostrar_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree MOSTRAR70=null;
		TreeRuleReturnScope valores71 =null;
		TreeRuleReturnScope coor_pos72 =null;

		CommonTree MOSTRAR70_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:187:8: ( ^( MOSTRAR ( valores ( coor_pos )? )+ ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:187:10: ^( MOSTRAR ( valores ( coor_pos )? )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			MOSTRAR70=(CommonTree)match(input,MOSTRAR,FOLLOW_MOSTRAR_in_mostrar627); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			MOSTRAR70_tree = (CommonTree)adaptor.dupNode(MOSTRAR70);


			root_1 = (CommonTree)adaptor.becomeRoot(MOSTRAR70_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:187:20: ( valores ( coor_pos )? )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==FALSO||LA14_0==FLOAT||LA14_0==ID||LA14_0==INT||LA14_0==STRING||LA14_0==VERDADERO) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:187:21: valores ( coor_pos )?
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_valores_in_mostrar630);
					valores71=valores();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, valores71.getTree());

					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:187:29: ( coor_pos )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==COORDENADA||LA13_0==POSICION) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTBTree.g:187:30: coor_pos
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_coor_pos_in_mostrar633);
							coor_pos72=coor_pos();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, coor_pos72.getTree());

							if ( state.backtracking==0 ) {
							}

							}
							break;

					}

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			if ( state.backtracking==0 ) {
					variables = variables + t.mostrar_en_pantalla_decla((valores71!=null?((LenguajeUTBTree.valores_return)valores71).valor:null), (valores71!=null?((LenguajeUTBTree.valores_return)valores71).tipo:null));
					flujo = flujo + t.mostrar_en_pantalla_flu((valores71!=null?((LenguajeUTBTree.valores_return)valores71).valor:null), (valores71!=null?((LenguajeUTBTree.valores_return)valores71).tipo:null));
								
			}
			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mostrar"


	public static class valores_return extends TreeRuleReturnScope {
		public String valor;
		public String tipo;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "valores"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:193:1: valores returns [String valor, String tipo] : ( ID | STRING | INT | FLOAT | ( VERDADERO | FALSO ) ) ;
	public final LenguajeUTBTree.valores_return valores() throws RecognitionException {
		LenguajeUTBTree.valores_return retval = new LenguajeUTBTree.valores_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ID73=null;
		CommonTree STRING74=null;
		CommonTree INT75=null;
		CommonTree FLOAT76=null;
		CommonTree VERDADERO77=null;
		CommonTree FALSO78=null;

		CommonTree ID73_tree=null;
		CommonTree STRING74_tree=null;
		CommonTree INT75_tree=null;
		CommonTree FLOAT76_tree=null;
		CommonTree VERDADERO77_tree=null;
		CommonTree FALSO78_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:193:45: ( ( ID | STRING | INT | FLOAT | ( VERDADERO | FALSO ) ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:193:48: ( ID | STRING | INT | FLOAT | ( VERDADERO | FALSO ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:193:48: ( ID | STRING | INT | FLOAT | ( VERDADERO | FALSO ) )
			int alt16=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt16=1;
				}
				break;
			case STRING:
				{
				alt16=2;
				}
				break;
			case INT:
				{
				alt16=3;
				}
				break;
			case FLOAT:
				{
				alt16=4;
				}
				break;
			case FALSO:
			case VERDADERO:
				{
				alt16=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:193:49: ID
					{
					_last = (CommonTree)input.LT(1);
					ID73=(CommonTree)match(input,ID,FOLLOW_ID_in_valores653); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID73_tree = (CommonTree)adaptor.dupNode(ID73);


					adaptor.addChild(root_0, ID73_tree);
					}

					if ( state.backtracking==0 ) {  
							if(TablaSimbolos.containsKey((ID73!=null?ID73.getText():null))){
								flujo = flujo + t.mostrar_en_pantalla_id((ID73!=null?ID73.getText():null),TablaSimbolos.get((ID73!=null?ID73.getText():null)));
								retval.valor = "";
								retval.tipo = "";
							}else{
								errores.add("con el dolor de mi alma te digo que " + (ID73!=null?ID73.getText():null) + " no existe Error: Linea "+(ID73!=null?ID73.getLine():0)+"\n");
							}}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:200:6: STRING
					{
					_last = (CommonTree)input.LT(1);
					STRING74=(CommonTree)match(input,STRING,FOLLOW_STRING_in_valores656); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING74_tree = (CommonTree)adaptor.dupNode(STRING74);


					adaptor.addChild(root_0, STRING74_tree);
					}

					if ( state.backtracking==0 ) {retval.valor = (STRING74!=null?STRING74.getText():null); retval.tipo ="texto";}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:200:53: INT
					{
					_last = (CommonTree)input.LT(1);
					INT75=(CommonTree)match(input,INT,FOLLOW_INT_in_valores659); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT75_tree = (CommonTree)adaptor.dupNode(INT75);


					adaptor.addChild(root_0, INT75_tree);
					}

					if ( state.backtracking==0 ) {retval.valor = (INT75!=null?INT75.getText():null); retval.tipo = "entero";}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:200:96: FLOAT
					{
					_last = (CommonTree)input.LT(1);
					FLOAT76=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_valores662); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT76_tree = (CommonTree)adaptor.dupNode(FLOAT76);


					adaptor.addChild(root_0, FLOAT76_tree);
					}

					if ( state.backtracking==0 ) {retval.valor = (FLOAT76!=null?FLOAT76.getText():null); retval.tipo = "real";}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 5 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:201:3: ( VERDADERO | FALSO )
					{
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:201:3: ( VERDADERO | FALSO )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==VERDADERO) ) {
						alt15=1;
					}
					else if ( (LA15_0==FALSO) ) {
						alt15=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTBTree.g:201:4: VERDADERO
							{
							_last = (CommonTree)input.LT(1);
							VERDADERO77=(CommonTree)match(input,VERDADERO,FOLLOW_VERDADERO_in_valores669); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VERDADERO77_tree = (CommonTree)adaptor.dupNode(VERDADERO77);


							adaptor.addChild(root_0, VERDADERO77_tree);
							}

							if ( state.backtracking==0 ) {retval.valor = (VERDADERO77!=null?VERDADERO77.getText():null); retval.tipo = "booleano";}
							if ( state.backtracking==0 ) {
							}

							}
							break;
						case 2 :
							// E:\\Documentos\\to explode\\LenguajeUTBTree.g:201:61: FALSO
							{
							_last = (CommonTree)input.LT(1);
							FALSO78=(CommonTree)match(input,FALSO,FOLLOW_FALSO_in_valores672); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							FALSO78_tree = (CommonTree)adaptor.dupNode(FALSO78);


							adaptor.addChild(root_0, FALSO78_tree);
							}

							if ( state.backtracking==0 ) {retval.valor = (FALSO78!=null?FALSO78.getText():null); retval.tipo = "booleano";}
							if ( state.backtracking==0 ) {
							}

							}
							break;

					}

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valores"


	public static class coor_pos_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "coor_pos"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:203:1: coor_pos : ( coor | pos ) ;
	public final LenguajeUTBTree.coor_pos_return coor_pos() throws RecognitionException {
		LenguajeUTBTree.coor_pos_return retval = new LenguajeUTBTree.coor_pos_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope coor79 =null;
		TreeRuleReturnScope pos80 =null;


		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:203:11: ( ( coor | pos ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:203:13: ( coor | pos )
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:203:13: ( coor | pos )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==COORDENADA) ) {
				alt17=1;
			}
			else if ( (LA17_0==POSICION) ) {
				alt17=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:203:14: coor
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_coor_in_coor_pos686);
					coor79=coor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, coor79.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:203:19: pos
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_pos_in_coor_pos688);
					pos80=pos();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, pos80.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "coor_pos"


	public static class coor_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "coor"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:204:1: coor : COORDENADA ^ coordenada ;
	public final LenguajeUTBTree.coor_return coor() throws RecognitionException {
		LenguajeUTBTree.coor_return retval = new LenguajeUTBTree.coor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree COORDENADA81=null;
		TreeRuleReturnScope coordenada82 =null;

		CommonTree COORDENADA81_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:204:6: ( COORDENADA ^ coordenada )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:204:8: COORDENADA ^ coordenada
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			COORDENADA81=(CommonTree)match(input,COORDENADA,FOLLOW_COORDENADA_in_coor697); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COORDENADA81_tree = (CommonTree)adaptor.dupNode(COORDENADA81);


			root_0 = (CommonTree)adaptor.becomeRoot(COORDENADA81_tree, root_0);
			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_coordenada_in_coor700);
			coordenada82=coordenada();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_0, coordenada82.getTree());

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "coor"


	public static class pos_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "pos"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:205:1: pos : POSICION ^ ( INT | ID ) ;
	public final LenguajeUTBTree.pos_return pos() throws RecognitionException {
		LenguajeUTBTree.pos_return retval = new LenguajeUTBTree.pos_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree POSICION83=null;
		CommonTree INT84=null;
		CommonTree ID85=null;

		CommonTree POSICION83_tree=null;
		CommonTree INT84_tree=null;
		CommonTree ID85_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:205:5: ( POSICION ^ ( INT | ID ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:205:7: POSICION ^ ( INT | ID )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			POSICION83=(CommonTree)match(input,POSICION,FOLLOW_POSICION_in_pos707); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			POSICION83_tree = (CommonTree)adaptor.dupNode(POSICION83);


			root_0 = (CommonTree)adaptor.becomeRoot(POSICION83_tree, root_0);
			}

			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:205:17: ( INT | ID )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==INT) ) {
				alt18=1;
			}
			else if ( (LA18_0==ID) ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:205:18: INT
					{
					_last = (CommonTree)input.LT(1);
					INT84=(CommonTree)match(input,INT,FOLLOW_INT_in_pos711); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT84_tree = (CommonTree)adaptor.dupNode(INT84);


					adaptor.addChild(root_0, INT84_tree);
					}

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:205:22: ID
					{
					_last = (CommonTree)input.LT(1);
					ID85=(CommonTree)match(input,ID,FOLLOW_ID_in_pos713); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID85_tree = (CommonTree)adaptor.dupNode(ID85);


					adaptor.addChild(root_0, ID85_tree);
					}

					if ( state.backtracking==0 ) {
							if(TablaSimbolos.containsKey((ID85!=null?ID85.getText():null)) == true){
							
							}else{
								
								errores.add("con el dolor de mi alma te digo que " + (ID85!=null?ID85.getText():null) + "no existe");
							}}
					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pos"


	public static class leer_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "leer"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:214:1: leer : ^( ESCRIBIR ID ) ;
	public final LenguajeUTBTree.leer_return leer() throws RecognitionException {
		LenguajeUTBTree.leer_return retval = new LenguajeUTBTree.leer_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ESCRIBIR86=null;
		CommonTree ID87=null;

		CommonTree ESCRIBIR86_tree=null;
		CommonTree ID87_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:214:6: ( ^( ESCRIBIR ID ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:214:8: ^( ESCRIBIR ID )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			ESCRIBIR86=(CommonTree)match(input,ESCRIBIR,FOLLOW_ESCRIBIR_in_leer727); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ESCRIBIR86_tree = (CommonTree)adaptor.dupNode(ESCRIBIR86);


			root_1 = (CommonTree)adaptor.becomeRoot(ESCRIBIR86_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			ID87=(CommonTree)match(input,ID,FOLLOW_ID_in_leer729); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID87_tree = (CommonTree)adaptor.dupNode(ID87);


			adaptor.addChild(root_1, ID87_tree);
			}

			if ( state.backtracking==0 ) {
						if(TablaSimbolos.containsKey((ID87!=null?ID87.getText():null))){
						flujo = flujo + t.escribir((ID87!=null?ID87.getText():null),TablaSimbolos.get((ID87!=null?ID87.getText():null)));
						}else{
						errores.add("con el dolor de mi alma te digo que " + (ID87!=null?ID87.getText():null) + " no existe, Error: Linea "+(ID87!=null?ID87.getLine():0)+"\n");
						}}
			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "leer"


	public static class si_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "si"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:223:1: si : ^( SI condicion ENTONCES ( sentencia )* ( SINO ENTONCES ( sentencia )* )* ) ;
	public final LenguajeUTBTree.si_return si() throws RecognitionException {
		LenguajeUTBTree.si_return retval = new LenguajeUTBTree.si_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree SI88=null;
		CommonTree ENTONCES90=null;
		CommonTree SINO92=null;
		CommonTree ENTONCES93=null;
		TreeRuleReturnScope condicion89 =null;
		TreeRuleReturnScope sentencia91 =null;
		TreeRuleReturnScope sentencia94 =null;

		CommonTree SI88_tree=null;
		CommonTree ENTONCES90_tree=null;
		CommonTree SINO92_tree=null;
		CommonTree ENTONCES93_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:223:4: ( ^( SI condicion ENTONCES ( sentencia )* ( SINO ENTONCES ( sentencia )* )* ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:223:9: ^( SI condicion ENTONCES ( sentencia )* ( SINO ENTONCES ( sentencia )* )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			SI88=(CommonTree)match(input,SI,FOLLOW_SI_in_si748); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SI88_tree = (CommonTree)adaptor.dupNode(SI88);


			root_1 = (CommonTree)adaptor.becomeRoot(SI88_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_condicion_in_si750);
			condicion89=condicion();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, condicion89.getTree());

			_last = (CommonTree)input.LT(1);
			ENTONCES90=(CommonTree)match(input,ENTONCES,FOLLOW_ENTONCES_in_si752); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ENTONCES90_tree = (CommonTree)adaptor.dupNode(ENTONCES90);


			adaptor.addChild(root_1, ENTONCES90_tree);
			}

			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:223:33: ( sentencia )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==AGREGAR||LA19_0==CAMBIAR||LA19_0==ESCRIBIR||LA19_0==ID||LA19_0==MIENTRAS||LA19_0==MOSTRAR||LA19_0==PARA||LA19_0==SI||LA19_0==VALOR) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:223:34: sentencia
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_sentencia_in_si755);
					sentencia91=sentencia();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, sentencia91.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					break loop19;
				}
			}

			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:223:46: ( SINO ENTONCES ( sentencia )* )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==SINO) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:223:47: SINO ENTONCES ( sentencia )*
					{
					_last = (CommonTree)input.LT(1);
					SINO92=(CommonTree)match(input,SINO,FOLLOW_SINO_in_si760); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SINO92_tree = (CommonTree)adaptor.dupNode(SINO92);


					adaptor.addChild(root_1, SINO92_tree);
					}

					_last = (CommonTree)input.LT(1);
					ENTONCES93=(CommonTree)match(input,ENTONCES,FOLLOW_ENTONCES_in_si762); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ENTONCES93_tree = (CommonTree)adaptor.dupNode(ENTONCES93);


					adaptor.addChild(root_1, ENTONCES93_tree);
					}

					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:223:60: ( sentencia )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==AGREGAR||LA20_0==CAMBIAR||LA20_0==ESCRIBIR||LA20_0==ID||LA20_0==MIENTRAS||LA20_0==MOSTRAR||LA20_0==PARA||LA20_0==SI||LA20_0==VALOR) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// E:\\Documentos\\to explode\\LenguajeUTBTree.g:223:61: sentencia
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_sentencia_in_si764);
							sentencia94=sentencia();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, sentencia94.getTree());

							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							break loop20;
						}
					}

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					break loop21;
				}
			}

			if ( state.backtracking==0 ) {
					if((condicion89!=null?((LenguajeUTBTree.condicion_return)condicion89).tipo:null).equals("booleano")){
						errores.add("Tipos incompatibles se espera un valor booleano Error: Linea \n");
					}
			}
			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "si"


	public static class mientras_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mientras"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:230:1: mientras : ^( MIENTRAS condicion ( sentencia )* ) ;
	public final LenguajeUTBTree.mientras_return mientras() throws RecognitionException {
		LenguajeUTBTree.mientras_return retval = new LenguajeUTBTree.mientras_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree MIENTRAS95=null;
		TreeRuleReturnScope condicion96 =null;
		TreeRuleReturnScope sentencia97 =null;

		CommonTree MIENTRAS95_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:230:9: ( ^( MIENTRAS condicion ( sentencia )* ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:230:14: ^( MIENTRAS condicion ( sentencia )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			MIENTRAS95=(CommonTree)match(input,MIENTRAS,FOLLOW_MIENTRAS_in_mientras784); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			MIENTRAS95_tree = (CommonTree)adaptor.dupNode(MIENTRAS95);


			root_1 = (CommonTree)adaptor.becomeRoot(MIENTRAS95_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_condicion_in_mientras786);
			condicion96=condicion();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, condicion96.getTree());

			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:230:36: ( sentencia )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==AGREGAR||LA22_0==CAMBIAR||LA22_0==ESCRIBIR||LA22_0==ID||LA22_0==MIENTRAS||LA22_0==MOSTRAR||LA22_0==PARA||LA22_0==SI||LA22_0==VALOR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:230:37: sentencia
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_sentencia_in_mientras790);
					sentencia97=sentencia();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, sentencia97.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					break loop22;
				}
			}

			if ( state.backtracking==0 ) {
					if((condicion96!=null?((LenguajeUTBTree.condicion_return)condicion96).tipo:null).equals("booleano")){
						errores.add("Tipos incompatibles se espera un valor booleano Error \n");
					}
			}
			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mientras"


	public static class para_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "para"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:236:1: para : ^( PARA b= ID EN ( ( RANGO DE d= INT A c= INT ) |a= ID ) ( sentencia )* ) ;
	public final LenguajeUTBTree.para_return para() throws RecognitionException {
		LenguajeUTBTree.para_return retval = new LenguajeUTBTree.para_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree b=null;
		CommonTree d=null;
		CommonTree c=null;
		CommonTree a=null;
		CommonTree PARA98=null;
		CommonTree EN99=null;
		CommonTree RANGO100=null;
		CommonTree DE101=null;
		CommonTree A102=null;
		TreeRuleReturnScope sentencia103 =null;

		CommonTree b_tree=null;
		CommonTree d_tree=null;
		CommonTree c_tree=null;
		CommonTree a_tree=null;
		CommonTree PARA98_tree=null;
		CommonTree EN99_tree=null;
		CommonTree RANGO100_tree=null;
		CommonTree DE101_tree=null;
		CommonTree A102_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:236:6: ( ^( PARA b= ID EN ( ( RANGO DE d= INT A c= INT ) |a= ID ) ( sentencia )* ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:236:11: ^( PARA b= ID EN ( ( RANGO DE d= INT A c= INT ) |a= ID ) ( sentencia )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			PARA98=(CommonTree)match(input,PARA,FOLLOW_PARA_in_para806); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PARA98_tree = (CommonTree)adaptor.dupNode(PARA98);


			root_1 = (CommonTree)adaptor.becomeRoot(PARA98_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			b=(CommonTree)match(input,ID,FOLLOW_ID_in_para810); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			b_tree = (CommonTree)adaptor.dupNode(b);


			adaptor.addChild(root_1, b_tree);
			}

			_last = (CommonTree)input.LT(1);
			EN99=(CommonTree)match(input,EN,FOLLOW_EN_in_para812); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			EN99_tree = (CommonTree)adaptor.dupNode(EN99);


			adaptor.addChild(root_1, EN99_tree);
			}

			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:236:26: ( ( RANGO DE d= INT A c= INT ) |a= ID )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==RANGO) ) {
				alt23=1;
			}
			else if ( (LA23_0==ID) ) {
				alt23=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:236:27: ( RANGO DE d= INT A c= INT )
					{
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:236:27: ( RANGO DE d= INT A c= INT )
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:236:28: RANGO DE d= INT A c= INT
					{
					_last = (CommonTree)input.LT(1);
					RANGO100=(CommonTree)match(input,RANGO,FOLLOW_RANGO_in_para816); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RANGO100_tree = (CommonTree)adaptor.dupNode(RANGO100);


					adaptor.addChild(root_1, RANGO100_tree);
					}

					_last = (CommonTree)input.LT(1);
					DE101=(CommonTree)match(input,DE,FOLLOW_DE_in_para818); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DE101_tree = (CommonTree)adaptor.dupNode(DE101);


					adaptor.addChild(root_1, DE101_tree);
					}

					_last = (CommonTree)input.LT(1);
					d=(CommonTree)match(input,INT,FOLLOW_INT_in_para822); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					d_tree = (CommonTree)adaptor.dupNode(d);


					adaptor.addChild(root_1, d_tree);
					}

					_last = (CommonTree)input.LT(1);
					A102=(CommonTree)match(input,A,FOLLOW_A_in_para824); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					A102_tree = (CommonTree)adaptor.dupNode(A102);


					adaptor.addChild(root_1, A102_tree);
					}

					_last = (CommonTree)input.LT(1);
					c=(CommonTree)match(input,INT,FOLLOW_INT_in_para828); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					c_tree = (CommonTree)adaptor.dupNode(c);


					adaptor.addChild(root_1, c_tree);
					}

					if ( state.backtracking==0 ) {

					 }
					if ( state.backtracking==0 ) {
					}

					}

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:238:5: a= ID
					{
					_last = (CommonTree)input.LT(1);
					a=(CommonTree)match(input,ID,FOLLOW_ID_in_para834); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					a_tree = (CommonTree)adaptor.dupNode(a);


					adaptor.addChild(root_1, a_tree);
					}

					if ( state.backtracking==0 ) {
						if(!TablaSimbolos.containsKey((a!=null?a.getText():null))){
						errores.add("con el dolor de mi alma te digo que  " + (a!=null?a.getText():null) + " no existe,  Error: Linea "+ (a!=null?a.getLine():0)+"\n");
						}else{
							TablaSimbolos.put((b!=null?b.getText():null),TablaSimbolos.get((a!=null?a.getText():null)));
							//traduccion
							//TablaSimbolos.remove((b!=null?b.getText():null));
							
						//verificar indices
							
						}}
					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:248:6: ( sentencia )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==AGREGAR||LA24_0==CAMBIAR||LA24_0==ESCRIBIR||LA24_0==ID||LA24_0==MIENTRAS||LA24_0==MOSTRAR||LA24_0==PARA||LA24_0==SI||LA24_0==VALOR) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:248:7: sentencia
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_sentencia_in_para839);
					sentencia103=sentencia();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, sentencia103.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					break loop24;
				}
			}

			if ( state.backtracking==0 ) {
				
				//condicion
				
				
				
				}
			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "para"


	public static class condicion_return extends TreeRuleReturnScope {
		public String tipo;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "condicion"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:257:1: condicion returns [String tipo] options {backtrack=true; } : ( ( ID ) | ^( CONJUNCION condicion condicion ) | ^( DISYUNCION condicion condicion ) | ( operaciones op_logicos operaciones ) | ^( EXPRESIONES condicion ) );
	public final LenguajeUTBTree.condicion_return condicion() throws RecognitionException {
		LenguajeUTBTree.condicion_return retval = new LenguajeUTBTree.condicion_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ID104=null;
		CommonTree CONJUNCION105=null;
		CommonTree DISYUNCION108=null;
		CommonTree EXPRESIONES114=null;
		TreeRuleReturnScope condicion106 =null;
		TreeRuleReturnScope condicion107 =null;
		TreeRuleReturnScope condicion109 =null;
		TreeRuleReturnScope condicion110 =null;
		TreeRuleReturnScope operaciones111 =null;
		TreeRuleReturnScope op_logicos112 =null;
		TreeRuleReturnScope operaciones113 =null;
		TreeRuleReturnScope condicion115 =null;

		CommonTree ID104_tree=null;
		CommonTree CONJUNCION105_tree=null;
		CommonTree DISYUNCION108_tree=null;
		CommonTree EXPRESIONES114_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:257:62: ( ( ID ) | ^( CONJUNCION condicion condicion ) | ^( DISYUNCION condicion condicion ) | ( operaciones op_logicos operaciones ) | ^( EXPRESIONES condicion ) )
			int alt25=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA25_1 = input.LA(2);
				if ( (synpred1_LenguajeUTBTree()) ) {
					alt25=1;
				}
				else if ( (synpred4_LenguajeUTBTree()) ) {
					alt25=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				break;
			case CONJUNCION:
				{
				alt25=2;
				}
				break;
			case DISYUNCION:
				{
				alt25=3;
				}
				break;
			case DIVISION:
			case FALSO:
			case FLOAT:
			case INT:
			case MODULO:
			case MULTIPLICACION:
			case RESTA:
			case STRING:
			case SUMA:
			case VERDADERO:
				{
				alt25=4;
				}
				break;
			case EXPRESIONES:
				{
				int LA25_14 = input.LA(2);
				if ( (synpred4_LenguajeUTBTree()) ) {
					alt25=4;
				}
				else if ( (true) ) {
					alt25=5;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:257:63: ( ID )
					{
					root_0 = (CommonTree)adaptor.nil();


					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:257:63: ( ID )
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:257:64: ID
					{
					_last = (CommonTree)input.LT(1);
					ID104=(CommonTree)match(input,ID,FOLLOW_ID_in_condicion866); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID104_tree = (CommonTree)adaptor.dupNode(ID104);


					adaptor.addChild(root_0, ID104_tree);
					}

					if ( state.backtracking==0 ) {
							if(!TablaSimbolos.containsKey((ID104!=null?ID104.getText():null))){
							errores.add("con el dolor de mi alma te digo que  " + (ID104!=null?ID104.getText():null) + " no existe  Error: Linea "+(ID104!=null?ID104.getLine():0)+"\n");
							}else{
								if(!TablaSimbolos.get((ID104!=null?ID104.getText():null)).equals("booleano")){
								   errores.add("Tipos incompatibles se espera un valor booleano Error: Linea "+(ID104!=null?ID104.getLine():0)+"\n");
								}else{
									retval.tipo = "booleano";
								}
							}
							
							}
					if ( state.backtracking==0 ) {
					}

					}

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:268:6: ^( CONJUNCION condicion condicion )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					CONJUNCION105=(CommonTree)match(input,CONJUNCION,FOLLOW_CONJUNCION_in_condicion871); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CONJUNCION105_tree = (CommonTree)adaptor.dupNode(CONJUNCION105);


					root_1 = (CommonTree)adaptor.becomeRoot(CONJUNCION105_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_condicion_in_condicion873);
					condicion106=condicion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, condicion106.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_condicion_in_condicion875);
					condicion107=condicion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, condicion107.getTree());

					if ( state.backtracking==0 ) {retval.tipo ="booleano";}
					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:269:4: ^( DISYUNCION condicion condicion )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DISYUNCION108=(CommonTree)match(input,DISYUNCION,FOLLOW_DISYUNCION_in_condicion883); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DISYUNCION108_tree = (CommonTree)adaptor.dupNode(DISYUNCION108);


					root_1 = (CommonTree)adaptor.becomeRoot(DISYUNCION108_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_condicion_in_condicion885);
					condicion109=condicion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, condicion109.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_condicion_in_condicion887);
					condicion110=condicion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, condicion110.getTree());

					if ( state.backtracking==0 ) {retval.tipo ="booleano";}
					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:270:4: ( operaciones op_logicos operaciones )
					{
					root_0 = (CommonTree)adaptor.nil();


					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:270:4: ( operaciones op_logicos operaciones )
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:270:5: operaciones op_logicos operaciones
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_condicion895);
					operaciones111=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, operaciones111.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_op_logicos_in_condicion897);
					op_logicos112=op_logicos();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, op_logicos112.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_condicion899);
					operaciones113=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, operaciones113.getTree());

					if ( state.backtracking==0 ) {
					}

					}

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 5 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:271:4: ^( EXPRESIONES condicion )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					EXPRESIONES114=(CommonTree)match(input,EXPRESIONES,FOLLOW_EXPRESIONES_in_condicion906); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXPRESIONES114_tree = (CommonTree)adaptor.dupNode(EXPRESIONES114);


					root_1 = (CommonTree)adaptor.becomeRoot(EXPRESIONES114_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_condicion_in_condicion908);
					condicion115=condicion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, condicion115.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condicion"


	public static class sentencia_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sentencia"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:276:1: sentencia : ( leer | si | mientras | para | ( ID operaciones ) | conversion_implicita | conversion_explicita | mostrar | operaciones_listas | operaciones_matrices ) ;
	public final LenguajeUTBTree.sentencia_return sentencia() throws RecognitionException {
		LenguajeUTBTree.sentencia_return retval = new LenguajeUTBTree.sentencia_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ID120=null;
		TreeRuleReturnScope leer116 =null;
		TreeRuleReturnScope si117 =null;
		TreeRuleReturnScope mientras118 =null;
		TreeRuleReturnScope para119 =null;
		TreeRuleReturnScope operaciones121 =null;
		TreeRuleReturnScope conversion_implicita122 =null;
		TreeRuleReturnScope conversion_explicita123 =null;
		TreeRuleReturnScope mostrar124 =null;
		TreeRuleReturnScope operaciones_listas125 =null;
		TreeRuleReturnScope operaciones_matrices126 =null;

		CommonTree ID120_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:276:11: ( ( leer | si | mientras | para | ( ID operaciones ) | conversion_implicita | conversion_explicita | mostrar | operaciones_listas | operaciones_matrices ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:276:13: ( leer | si | mientras | para | ( ID operaciones ) | conversion_implicita | conversion_explicita | mostrar | operaciones_listas | operaciones_matrices )
			{
			root_0 = (CommonTree)adaptor.nil();


			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:276:13: ( leer | si | mientras | para | ( ID operaciones ) | conversion_implicita | conversion_explicita | mostrar | operaciones_listas | operaciones_matrices )
			int alt26=10;
			switch ( input.LA(1) ) {
			case ESCRIBIR:
				{
				alt26=1;
				}
				break;
			case SI:
				{
				alt26=2;
				}
				break;
			case MIENTRAS:
				{
				alt26=3;
				}
				break;
			case PARA:
				{
				alt26=4;
				}
				break;
			case ID:
				{
				alt26=5;
				}
				break;
			case VALOR:
				{
				int LA26_6 = input.LA(2);
				if ( (LA26_6==DOWN) ) {
					int LA26_10 = input.LA(3);
					if ( (LA26_10==ID) ) {
						int LA26_12 = input.LA(4);
						if ( (LA26_12==ID) ) {
							int LA26_14 = input.LA(5);
							if ( (LA26_14==UP) ) {
								alt26=6;
							}
							else if ( (LA26_14==BOOLEANO||LA26_14==ENTERO||LA26_14==REAL||LA26_14==TEXTO) ) {
								alt26=7;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 26, 14, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 26, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 26, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MOSTRAR:
				{
				alt26=8;
				}
				break;
			case AGREGAR:
				{
				alt26=9;
				}
				break;
			case CAMBIAR:
				{
				int LA26_9 = input.LA(2);
				if ( (LA26_9==DOWN) ) {
					int LA26_11 = input.LA(3);
					if ( (LA26_11==ID) ) {
						int LA26_13 = input.LA(4);
						if ( (LA26_13==POSICION) ) {
							alt26=9;
						}
						else if ( (LA26_13==COORDENADA) ) {
							alt26=10;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 26, 13, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 26, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:276:14: leer
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_leer_in_sentencia925);
					leer116=leer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, leer116.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:276:20: si
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_si_in_sentencia928);
					si117=si();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, si117.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:276:24: mientras
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_mientras_in_sentencia931);
					mientras118=mientras();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, mientras118.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:276:34: para
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_para_in_sentencia934);
					para119=para();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, para119.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 5 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:276:41: ( ID operaciones )
					{
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:276:41: ( ID operaciones )
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:276:42: ID operaciones
					{
					_last = (CommonTree)input.LT(1);
					ID120=(CommonTree)match(input,ID,FOLLOW_ID_in_sentencia939); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID120_tree = (CommonTree)adaptor.dupNode(ID120);


					adaptor.addChild(root_0, ID120_tree);
					}

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_in_sentencia941);
					operaciones121=operaciones();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, operaciones121.getTree());

					if ( state.backtracking==0 ) {
								if(TablaSimbolos.containsKey((ID120!=null?ID120.getText():null))){
									if(TablaSimbolos.get((ID120!=null?ID120.getText():null)) == (operaciones121!=null?((LenguajeUTBTree.operaciones_return)operaciones121).tipo:null)){
										System.out.print("Se agrego con exito\n");
									}else{
										
										errores.add("Tipos incompatibles se espera: " + TablaSimbolos.get((ID120!=null?ID120.getText():null))+" Linea " + (ID120!=null?ID120.getLine():0)+"\n" );
									}
									
								}else{
									
									errores.add("con el dolor de mi alma te digo que  " + (ID120!=null?ID120.getText():null) + "no existe\n");
								}
								}
					if ( state.backtracking==0 ) {
					}

					}

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 6 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:289:8: conversion_implicita
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_conversion_implicita_in_sentencia947);
					conversion_implicita122=conversion_implicita();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, conversion_implicita122.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 7 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:289:29: conversion_explicita
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_conversion_explicita_in_sentencia949);
					conversion_explicita123=conversion_explicita();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, conversion_explicita123.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 8 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:289:51: mostrar
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_mostrar_in_sentencia952);
					mostrar124=mostrar();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, mostrar124.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 9 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:289:59: operaciones_listas
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_listas_in_sentencia954);
					operaciones_listas125=operaciones_listas();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, operaciones_listas125.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 10 :
					// E:\\Documentos\\to explode\\LenguajeUTBTree.g:289:78: operaciones_matrices
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operaciones_matrices_in_sentencia956);
					operaciones_matrices126=operaciones_matrices();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, operaciones_matrices126.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sentencia"


	public static class op_logicos_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "op_logicos"
	// E:\\Documentos\\to explode\\LenguajeUTBTree.g:292:1: op_logicos : ( IGUAL_QUE | MAYOR_QUE | MENOR_QUE | MAYOR_O_IGUAL_QUE | MENOR_O_IGUAL_QUE ) ;
	public final LenguajeUTBTree.op_logicos_return op_logicos() throws RecognitionException {
		LenguajeUTBTree.op_logicos_return retval = new LenguajeUTBTree.op_logicos_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set127=null;

		CommonTree set127_tree=null;

		try {
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:293:2: ( ( IGUAL_QUE | MAYOR_QUE | MENOR_QUE | MAYOR_O_IGUAL_QUE | MENOR_O_IGUAL_QUE ) )
			// E:\\Documentos\\to explode\\LenguajeUTBTree.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set127=(CommonTree)input.LT(1);
			if ( input.LA(1)==IGUAL_QUE||(input.LA(1) >= MAYOR_O_IGUAL_QUE && input.LA(1) <= MAYOR_QUE)||(input.LA(1) >= MENOR_O_IGUAL_QUE && input.LA(1) <= MENOR_QUE) ) {
				input.consume();
				if ( state.backtracking==0 ) {
				set127_tree = (CommonTree)adaptor.dupNode(set127);


				adaptor.addChild(root_0, set127_tree);
				}

				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			if ( state.backtracking==0 ) {
			}
			 

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "op_logicos"

	// $ANTLR start synpred1_LenguajeUTBTree
	public final void synpred1_LenguajeUTBTree_fragment() throws RecognitionException {
		// E:\\Documentos\\to explode\\LenguajeUTBTree.g:257:63: ( ( ID ) )
		// E:\\Documentos\\to explode\\LenguajeUTBTree.g:257:63: ( ID )
		{
		// E:\\Documentos\\to explode\\LenguajeUTBTree.g:257:63: ( ID )
		// E:\\Documentos\\to explode\\LenguajeUTBTree.g:257:64: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred1_LenguajeUTBTree866); if (state.failed) return;

		}

		}

	}
	// $ANTLR end synpred1_LenguajeUTBTree

	// $ANTLR start synpred4_LenguajeUTBTree
	public final void synpred4_LenguajeUTBTree_fragment() throws RecognitionException {
		// E:\\Documentos\\to explode\\LenguajeUTBTree.g:270:4: ( ( operaciones op_logicos operaciones ) )
		// E:\\Documentos\\to explode\\LenguajeUTBTree.g:270:4: ( operaciones op_logicos operaciones )
		{
		// E:\\Documentos\\to explode\\LenguajeUTBTree.g:270:4: ( operaciones op_logicos operaciones )
		// E:\\Documentos\\to explode\\LenguajeUTBTree.g:270:5: operaciones op_logicos operaciones
		{
		pushFollow(FOLLOW_operaciones_in_synpred4_LenguajeUTBTree895);
		operaciones();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_op_logicos_in_synpred4_LenguajeUTBTree897);
		op_logicos();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_operaciones_in_synpred4_LenguajeUTBTree899);
		operaciones();
		state._fsp--;
		if (state.failed) return;

		}

		}

	}
	// $ANTLR end synpred4_LenguajeUTBTree

	// Delegated rules

	public final boolean synpred1_LenguajeUTBTree() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_LenguajeUTBTree_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_LenguajeUTBTree() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_LenguajeUTBTree_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_titulo_programa_in_estructura50 = new BitSet(new long[]{0x0000004000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_variables_in_estructura53 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_flujo_in_estructura57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOMBRE_DEL_EJERCICIO_in_titulo_programa66 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_titulo_programa69 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VARIABLES_in_variables79 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaracion_in_variables81 = new BitSet(new long[]{0x0000000000040008L});
	public static final BitSet FOLLOW_FLUJO_in_flujo95 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_sentencia_in_flujo98 = new BitSet(new long[]{0x1400080008000128L,0x0000000000808008L});
	public static final BitSet FOLLOW_DECLA_in_declaracion111 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_op_decla_in_declaracion113 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIPO_in_op_decla123 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_var_in_op_decla125 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_op_decla129 = new BitSet(new long[]{0x0000000000000008L,0x0000000001000000L});
	public static final BitSet FOLLOW_valor_inicial_in_op_decla131 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_listas_in_op_decla137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_matriz_in_op_decla142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALOR_INICIAL_in_valor_inicial159 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_valor_inicial162 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STRING_in_valor_inicial171 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FLOAT_in_valor_inicial180 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FALSO_in_valor_inicial190 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VERDADERO_in_valor_inicial193 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ENTERO_in_var208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_var211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_var214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEANO_in_var217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LISTA_in_listas232 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_var_in_listas234 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_listas237 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MATRIZ_in_matriz250 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_var_in_matriz252 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_matriz255 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_INT_in_matriz259 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_INT_in_matriz263 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VALOR_in_conversion_implicita280 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_conversion_implicita284 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_conversion_implicita288 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VALOR_in_conversion_explicita299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_conversion_explicita301 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_conversion_explicita305 = new BitSet(new long[]{0x0000000001000080L,0x0000000000100800L});
	public static final BitSet FOLLOW_var_in_conversion_explicita308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SUMA_in_operaciones326 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operaciones_in_operaciones330 = new BitSet(new long[]{0x28008820C0400000L,0x0000000004061000L});
	public static final BitSet FOLLOW_operaciones_in_operaciones334 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RESTA_in_operaciones343 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operaciones_in_operaciones347 = new BitSet(new long[]{0x28008820C0400000L,0x0000000004061000L});
	public static final BitSet FOLLOW_operaciones_in_operaciones351 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULTIPLICACION_in_operaciones360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operaciones_in_operaciones364 = new BitSet(new long[]{0x28008820C0400000L,0x0000000004061000L});
	public static final BitSet FOLLOW_operaciones_in_operaciones368 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVISION_in_operaciones377 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operaciones_in_operaciones381 = new BitSet(new long[]{0x28008820C0400000L,0x0000000004061000L});
	public static final BitSet FOLLOW_operaciones_in_operaciones385 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODULO_in_operaciones394 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operaciones_in_operaciones398 = new BitSet(new long[]{0x28008820C0400000L,0x0000000004061000L});
	public static final BitSet FOLLOW_operaciones_in_operaciones402 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_valor_in_operaciones410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPRESIONES_in_operaciones418 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operaciones_in_operaciones422 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_valor434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_valor444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_valor454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_valor464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERDADERO_in_valor468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSO_in_valor471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_LISTAS_in_op_listas492 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operaciones_listas_in_op_listas494 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_agregar_a_lista_in_operaciones_listas502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modificar_de_lista_in_operaciones_listas504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGREGAR_in_agregar_a_lista515 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_agregar_a_lista518 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020000L});
	public static final BitSet FOLLOW_valor_in_agregar_a_lista521 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CAMBIAR_in_modificar_de_lista534 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_modificar_de_lista536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_POSICION_in_modificar_de_lista538 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020000L});
	public static final BitSet FOLLOW_valor_in_modificar_de_lista542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_POR_in_modificar_de_lista544 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020000L});
	public static final BitSet FOLLOW_valor_in_modificar_de_lista548 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_LISTAS_in_op_matrices561 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operaciones_matrices_in_op_matrices563 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_modificar_de_matriz_in_operaciones_matrices571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAMBIAR_in_modificar_de_matriz580 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_modificar_de_matriz582 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COORDENADA_in_modificar_de_matriz584 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_coordenada_in_modificar_de_matriz586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_POR_in_modificar_de_matriz588 = new BitSet(new long[]{0x0000882080000000L,0x0000000004020000L});
	public static final BitSet FOLLOW_valor_in_modificar_de_matriz590 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_coordenada609 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_INT_in_coordenada613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOSTRAR_in_mostrar627 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_valores_in_mostrar630 = new BitSet(new long[]{0x0000882080010008L,0x0000000004020100L});
	public static final BitSet FOLLOW_coor_pos_in_mostrar633 = new BitSet(new long[]{0x0000882080000008L,0x0000000004020000L});
	public static final BitSet FOLLOW_ID_in_valores653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_valores656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_valores659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_valores662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERDADERO_in_valores669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSO_in_valores672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_coor_in_coor_pos686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pos_in_coor_pos688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COORDENADA_in_coor697 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_coordenada_in_coor700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POSICION_in_pos707 = new BitSet(new long[]{0x0000880000000000L});
	public static final BitSet FOLLOW_INT_in_pos711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_pos713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ESCRIBIR_in_leer727 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_leer729 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SI_in_si748 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_condicion_in_si750 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ENTONCES_in_si752 = new BitSet(new long[]{0x1400080008000128L,0x0000000000818008L});
	public static final BitSet FOLLOW_sentencia_in_si755 = new BitSet(new long[]{0x1400080008000128L,0x0000000000818008L});
	public static final BitSet FOLLOW_SINO_in_si760 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ENTONCES_in_si762 = new BitSet(new long[]{0x1400080008000128L,0x0000000000818008L});
	public static final BitSet FOLLOW_sentencia_in_si764 = new BitSet(new long[]{0x1400080008000128L,0x0000000000818008L});
	public static final BitSet FOLLOW_MIENTRAS_in_mientras784 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_condicion_in_mientras786 = new BitSet(new long[]{0x1400080008000128L,0x0000000000808008L});
	public static final BitSet FOLLOW_sentencia_in_mientras790 = new BitSet(new long[]{0x1400080008000128L,0x0000000000808008L});
	public static final BitSet FOLLOW_PARA_in_para806 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_para810 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_EN_in_para812 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RANGO_in_para816 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DE_in_para818 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_INT_in_para822 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_para824 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_INT_in_para828 = new BitSet(new long[]{0x1400080008000128L,0x0000000000808008L});
	public static final BitSet FOLLOW_ID_in_para834 = new BitSet(new long[]{0x1400080008000128L,0x0000000000808008L});
	public static final BitSet FOLLOW_sentencia_in_para839 = new BitSet(new long[]{0x1400080008000128L,0x0000000000808008L});
	public static final BitSet FOLLOW_ID_in_condicion866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJUNCION_in_condicion871 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_condicion_in_condicion873 = new BitSet(new long[]{0x28008820C0604000L,0x0000000004061000L});
	public static final BitSet FOLLOW_condicion_in_condicion875 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DISYUNCION_in_condicion883 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_condicion_in_condicion885 = new BitSet(new long[]{0x28008820C0604000L,0x0000000004061000L});
	public static final BitSet FOLLOW_condicion_in_condicion887 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operaciones_in_condicion895 = new BitSet(new long[]{0x0360200000000000L});
	public static final BitSet FOLLOW_op_logicos_in_condicion897 = new BitSet(new long[]{0x28008820C0400000L,0x0000000004061000L});
	public static final BitSet FOLLOW_operaciones_in_condicion899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPRESIONES_in_condicion906 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_condicion_in_condicion908 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_leer_in_sentencia925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_si_in_sentencia928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mientras_in_sentencia931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_para_in_sentencia934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_sentencia939 = new BitSet(new long[]{0x28008820C0400000L,0x0000000004061000L});
	public static final BitSet FOLLOW_operaciones_in_sentencia941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conversion_implicita_in_sentencia947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conversion_explicita_in_sentencia949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mostrar_in_sentencia952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operaciones_listas_in_sentencia954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operaciones_matrices_in_sentencia956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred1_LenguajeUTBTree866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operaciones_in_synpred4_LenguajeUTBTree895 = new BitSet(new long[]{0x0360200000000000L});
	public static final BitSet FOLLOW_op_logicos_in_synpred4_LenguajeUTBTree897 = new BitSet(new long[]{0x28008820C0400000L,0x0000000004061000L});
	public static final BitSet FOLLOW_operaciones_in_synpred4_LenguajeUTBTree899 = new BitSet(new long[]{0x0000000000000002L});
}
