/* The following code was generated by JFlex 1.7.0 */

/**
 * Escáner que detecta números, palabras, palabras reservadas, identificadores y hexadecimales
*/


public class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\2\3\25\0\1\3\17\0\1\4\11\1\7\0\6\6\21\2"+
    "\1\5\2\2\6\0\1\17\1\11\1\14\1\23\1\21\1\25\2\2"+
    "\1\13\2\2\1\12\1\2\1\26\1\22\1\7\1\2\1\15\1\24"+
    "\1\20\1\10\1\16\1\2\1\5\2\2\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff95\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\2\5\3\1\0"+
    "\6\3\1\0\7\3\1\5\11\3\1\6\2\3\1\6"+
    "\4\3\1\6\6\3\1\6\56\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\27\0\56\0\105\0\27\0\134\0\163\0\212"+
    "\0\241\0\270\0\317\0\346\0\375\0\u0114\0\u012b\0\u0142"+
    "\0\u0159\0\u0170\0\u0187\0\u019e\0\u01b5\0\u01cc\0\u01e3\0\u01fa"+
    "\0\u0211\0\u0228\0\u0187\0\u023f\0\u0256\0\u026d\0\u0284\0\u029b"+
    "\0\u02b2\0\u02c9\0\u02e0\0\u02f7\0\u02b2\0\u030e\0\u0325\0\u0325"+
    "\0\u033c\0\u0353\0\u036a\0\u0381\0\u0381\0\u0398\0\u03af\0\u03c6"+
    "\0\u03dd\0\u03f4\0\u040b\0\u040b\0\u0422\0\u0439\0\u0450\0\u0467"+
    "\0\u047e\0\u0495\0\u04ac\0\u04c3\0\u04da\0\u04f1\0\u0508\0\u051f"+
    "\0\u0536\0\u054d\0\u0564\0\u057b\0\u0592\0\u05a9\0\u05c0\0\u05d7"+
    "\0\u05ee\0\u0605\0\u061c\0\u0633\0\u064a\0\u0661\0\u0678\0\u068f"+
    "\0\u06a6\0\u06bd\0\u06d4\0\u06eb\0\u0702\0\u0719\0\u0730\0\u0747"+
    "\0\u075e\0\u0775\0\u078c\0\u07a3\0\u07ba\0\u07d1\0\u07e8\0\u07ff"+
    "\0\27\0\u0816";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\2\4\1\7\14\4"+
    "\1\10\1\11\1\4\30\0\1\3\2\0\1\3\23\0"+
    "\1\12\1\13\1\0\1\12\22\13\1\0\1\3\2\0"+
    "\1\3\1\14\22\0\1\12\1\13\1\0\1\12\3\13"+
    "\1\15\4\13\1\16\11\13\1\0\1\12\1\13\1\0"+
    "\1\12\13\13\1\17\6\13\1\0\1\12\1\13\1\0"+
    "\1\12\6\13\1\20\13\13\1\0\2\21\1\0\23\21"+
    "\1\0\1\21\1\22\1\0\1\21\22\22\1\0\1\23"+
    "\2\0\1\23\23\0\1\21\1\22\1\0\1\21\4\22"+
    "\1\24\15\22\1\0\1\21\1\22\1\0\1\21\6\22"+
    "\1\25\6\22\1\26\4\22\1\0\1\21\1\22\1\0"+
    "\1\21\12\22\1\27\7\22\1\0\1\21\1\22\1\0"+
    "\1\21\21\22\1\30\1\0\2\31\1\0\23\31\1\0"+
    "\1\31\1\32\1\0\1\31\22\32\1\0\1\33\2\0"+
    "\1\33\1\0\1\33\2\0\1\33\2\0\1\33\2\0"+
    "\1\33\1\0\1\33\1\0\1\33\1\0\1\33\2\0"+
    "\1\31\1\32\1\0\1\31\5\32\1\34\14\32\1\0"+
    "\1\31\1\32\1\0\1\31\11\32\1\35\10\32\1\0"+
    "\1\31\1\32\1\0\1\31\13\32\1\36\6\32\1\0"+
    "\1\31\1\32\1\0\1\31\13\32\1\34\6\32\1\0"+
    "\1\31\1\32\1\0\1\31\12\32\1\37\7\32\1\0"+
    "\2\40\1\0\23\40\1\0\1\40\1\41\1\0\1\40"+
    "\22\41\1\0\1\40\1\41\1\0\1\40\6\41\1\42"+
    "\13\41\1\0\1\40\1\41\1\0\1\40\12\41\1\43"+
    "\7\41\1\0\1\40\1\41\1\0\1\40\14\41\1\44"+
    "\5\41\1\0\1\40\1\41\1\0\1\40\5\41\1\45"+
    "\14\41\1\0\2\46\1\0\23\46\1\0\1\46\1\47"+
    "\1\0\1\46\22\47\1\0\1\46\1\47\1\0\1\46"+
    "\7\47\1\50\12\47\1\0\1\46\1\47\1\0\1\46"+
    "\13\47\1\51\6\47\1\0\1\46\1\47\1\0\1\46"+
    "\7\47\1\52\12\47\1\0\2\53\1\0\23\53\1\0"+
    "\1\53\1\54\1\0\1\53\22\54\1\0\1\53\1\54"+
    "\1\0\1\53\14\54\1\55\5\54\1\0\1\53\1\54"+
    "\1\0\1\53\13\54\1\56\6\54\1\0\2\57\1\0"+
    "\23\57\1\0\1\57\1\60\1\0\1\57\22\60\1\0"+
    "\1\57\1\60\1\0\1\57\14\60\1\61\5\60\1\0"+
    "\2\62\1\0\23\62\1\0\1\62\1\63\1\0\1\62"+
    "\22\63\1\0\1\62\1\63\1\0\1\62\16\63\1\64"+
    "\3\63\1\0\2\65\1\0\23\65\1\0\1\65\1\66"+
    "\1\0\1\65\22\66\1\0\2\67\1\0\23\67\1\0"+
    "\1\67\1\70\1\0\1\67\22\70\1\0\2\71\1\0"+
    "\23\71\1\0\1\71\1\72\1\0\1\71\22\72\1\0"+
    "\2\73\1\0\23\73\1\0\1\73\1\74\1\0\1\73"+
    "\22\74\1\0\2\75\1\0\23\75\1\0\1\75\1\76"+
    "\1\0\1\75\22\76\1\0\2\77\1\0\23\77\1\0"+
    "\1\77\1\100\1\0\1\77\22\100\1\0\2\101\1\0"+
    "\23\101\1\0\1\101\1\102\1\0\1\101\22\102\1\0"+
    "\2\103\1\0\23\103\1\0\1\103\1\104\1\0\1\103"+
    "\22\104\1\0\2\105\1\0\23\105\1\0\1\105\1\106"+
    "\1\0\1\105\22\106\1\0\2\107\1\0\23\107\1\0"+
    "\1\107\1\110\1\0\1\107\22\110\1\0\2\111\1\0"+
    "\23\111\1\0\1\111\1\112\1\0\1\111\22\112\1\0"+
    "\2\113\1\0\23\113\1\0\1\113\1\114\1\0\1\113"+
    "\22\114\1\0\2\115\1\0\23\115\1\0\1\115\1\116"+
    "\1\0\1\115\22\116\1\0\2\117\1\0\23\117\1\0"+
    "\1\117\1\120\1\0\1\117\22\120\1\0\2\121\1\0"+
    "\23\121\1\0\1\121\1\122\1\0\1\121\22\122\1\0"+
    "\2\123\1\0\23\123\1\0\1\123\1\124\1\0\1\123"+
    "\22\124\1\0\2\125\1\0\23\125\1\0\1\125\1\126"+
    "\1\0\1\125\22\126\1\0\2\127\1\0\23\127\1\0"+
    "\1\127\1\130\1\0\1\127\22\130\1\0\2\131\1\0"+
    "\23\131\1\0\1\131\1\132\1\0\1\131\22\132\1\0"+
    "\2\133\1\0\23\133\1\0\1\133\1\134\1\0\1\133"+
    "\22\134\1\0\2\135\1\0\23\135\1\0\1\135\1\136"+
    "\1\0\1\135\22\136\1\0\2\137\1\0\23\137\1\0"+
    "\1\137\1\140\1\0\1\137\22\140\1\0\2\141\1\0"+
    "\23\141\1\0\1\141\1\142\1\0\1\141\22\142\2\0"+
    "\1\142\2\0\22\142";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2093];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\6\1\1\0\6\1\1\0"+
    "\115\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 106) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.print(yytext());
            } 
            // fall through
          case 7: break;
          case 2: 
            { System.out.print("Encontré un número: "+yytext()+"\n");
            } 
            // fall through
          case 8: break;
          case 3: 
            { System.out.print("Encontré una palabra: "+yytext()+"\n");
            } 
            // fall through
          case 9: break;
          case 4: 
            { /* La acción léxica puede ir vacía si queremos que el escáner ignore la regla*/
            } 
            // fall through
          case 10: break;
          case 5: 
            { System.out.print("Encontré un número hexadecimal: "+yytext()+"\n");
            } 
            // fall through
          case 11: break;
          case 6: 
            { System.out.print("Encontré una palabra reservada: "+yytext()+"\n");
            } 
            // fall through
          case 12: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
