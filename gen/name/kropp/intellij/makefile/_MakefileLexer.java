/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package name.kropp.intellij.makefile;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import name.kropp.intellij.makefile.psi.MakefileTypes;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static name.kropp.intellij.makefile.psi.MakefileTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>MakefileLexer.flex</tt>
 */
public class _MakefileLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int SEPARATOR = 2;
  public static final int DEPENDENCIES = 4;
  public static final int COMMANDS = 6;
  public static final int VARIABLE = 8;
  public static final int INCLUDES = 10;
  public static final int CONDITIONALS = 12;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6, 6
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1040 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\177\200");

  /* The ZZ_CMAP_A table has 256 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\1\2\0\1\1\22\0\1\2\1\7\1\0\1\4\7\0\1\7\16\0\1\5\2\0\1\6\1\0\1"+
    "\7\43\0\1\12\1\15\1\16\1\17\2\0\1\10\2\0\1\13\1\0\1\11\2\0\1\20\1\0\1\21\1"+
    "\0\1\14\212\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\7\0\1\1\1\2\1\3\1\4\1\5\2\1\1\6"+
    "\1\7\1\10\1\3\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\4\1\1\0\5\1\1\22"+
    "\1\1\1\23\1\1\1\24\1\1\1\25";

  private static int [] zzUnpackAction() {
    int [] result = new int[44];
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
    "\0\0\0\22\0\44\0\66\0\110\0\132\0\154\0\176"+
    "\0\220\0\242\0\264\0\306\0\330\0\352\0\374\0\u010e"+
    "\0\242\0\u0120\0\u0132\0\u0144\0\u0156\0\u0168\0\u017a\0\u018c"+
    "\0\u019e\0\u01b0\0\u01c2\0\u01d4\0\u01e6\0\u01f8\0\u020a\0\u0120"+
    "\0\u021c\0\u022e\0\u0240\0\u0252\0\u0264\0\176\0\u0276\0\176"+
    "\0\u0288\0\176\0\u029a\0\176";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[44];
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
    "\1\10\1\11\1\12\1\13\1\14\1\12\2\10\1\15"+
    "\5\10\1\16\3\10\2\12\2\17\1\12\1\20\1\21"+
    "\1\22\12\12\1\23\1\24\2\25\1\23\1\12\14\23"+
    "\1\26\1\12\20\26\1\27\1\24\20\27\1\30\1\12"+
    "\2\31\1\30\1\12\14\30\1\32\1\11\2\33\1\32"+
    "\1\12\14\32\1\10\3\0\1\10\1\0\14\10\1\0"+
    "\1\11\45\0\1\13\16\0\1\14\1\0\20\14\1\10"+
    "\3\0\1\10\1\0\3\10\1\34\5\10\1\35\3\10"+
    "\3\0\1\10\1\0\3\10\1\36\1\10\1\37\6\10"+
    "\2\0\2\17\23\0\1\40\1\21\21\0\1\21\13\0"+
    "\1\23\3\0\1\23\1\0\14\23\1\0\1\24\22\0"+
    "\2\25\16\0\1\26\1\0\20\26\1\27\1\0\20\27"+
    "\1\30\3\0\1\30\1\0\14\30\2\0\2\31\16\0"+
    "\1\32\3\0\1\32\1\0\14\32\2\0\2\33\16\0"+
    "\1\10\3\0\1\10\1\0\4\10\1\41\10\10\3\0"+
    "\1\10\1\0\10\10\1\42\4\10\3\0\1\10\1\0"+
    "\7\10\1\43\5\10\3\0\1\10\1\0\13\10\1\44"+
    "\1\10\3\0\1\10\1\0\5\10\1\45\7\10\3\0"+
    "\1\10\1\0\12\10\1\46\2\10\3\0\1\10\1\0"+
    "\2\10\1\47\12\10\3\0\1\10\1\0\10\10\1\50"+
    "\4\10\3\0\1\10\1\0\6\10\1\51\6\10\3\0"+
    "\1\10\1\0\11\10\1\52\3\10\3\0\1\10\1\0"+
    "\7\10\1\53\5\10\3\0\1\10\1\0\10\10\1\54"+
    "\3\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[684];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\7\0\2\1\1\11\6\1\1\11\16\1\1\0\14\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[44];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _MakefileLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MakefileLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(SEPARATOR); return IDENTIFIER;
            }
          case 22: break;
          case 2: 
            { yybegin(YYINITIAL); return WHITE_SPACE;
            }
          case 23: break;
          case 3: 
            { return BAD_CHARACTER;
            }
          case 24: break;
          case 4: 
            { yybegin(COMMANDS); return WHITE_SPACE;
            }
          case 25: break;
          case 5: 
            { yybegin(YYINITIAL); return COMMENT;
            }
          case 26: break;
          case 6: 
            { yybegin(SEPARATOR); return WHITE_SPACE;
            }
          case 27: break;
          case 7: 
            { yybegin(DEPENDENCIES); return COLON;
            }
          case 28: break;
          case 8: 
            { yybegin(VARIABLE); return ASSIGN;
            }
          case 29: break;
          case 9: 
            { yybegin(DEPENDENCIES); return IDENTIFIER;
            }
          case 30: break;
          case 10: 
            { yybegin(YYINITIAL); return EOL;
            }
          case 31: break;
          case 11: 
            { yybegin(DEPENDENCIES); return WHITE_SPACE;
            }
          case 32: break;
          case 12: 
            { yybegin(YYINITIAL); return COMMAND;
            }
          case 33: break;
          case 13: 
            { yybegin(VARIABLE); return VARIABLE_VALUE;
            }
          case 34: break;
          case 14: 
            { yybegin(YYINITIAL); return FILENAME;
            }
          case 35: break;
          case 15: 
            { yybegin(INCLUDES); return WHITE_SPACE;
            }
          case 36: break;
          case 16: 
            { yybegin(YYINITIAL); return CONDITION;
            }
          case 37: break;
          case 17: 
            { return WHITE_SPACE;
            }
          case 38: break;
          case 18: 
            { yybegin(CONDITIONALS); return IFEQ;
            }
          case 39: break;
          case 19: 
            { yybegin(YYINITIAL); return ELSE_;
            }
          case 40: break;
          case 20: 
            { yybegin(YYINITIAL); return ENDIF;
            }
          case 41: break;
          case 21: 
            { yybegin(INCLUDES); return INCLUDE;
            }
          case 42: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}