package spring.cours.jpa.atelier2;

import java.util.regex.Pattern;

public class ValidationUtils {

	public static boolean valider(String input) {
		// Vérifier si l'entrée contient la chaîne "projet"
		// suivie de jusqu'à 10 chiffres
		return Pattern.matches("(?i).*projet\\s*\\d{1,10}.*", input);
	}

	public static boolean validerLangage(String langage) {

		// Convertir le paramètre langage en minuscules
		langage = langage.toLowerCase();

		// Parcourir tous les noms de langages
		for (String l : LANGAGES) {
			// Convertir le nom de langage en minuscules
			String nomLangage = l.toLowerCase();

			// Si le nom de langage contient la chaîne recherchée,
			// retourner true
			if (nomLangage.contains(langage)) {
				return true;
			}
		}

		// Si on n'a pas trouvé de correspondance, retourner false
		return false;
	}

	final static String[] LANGAGES = new String[] { "A# .NET", "A#", "A+", "ABAP", "ABC", "ABC.NET", "ACC", "Ace DASL",
			"Action!", "ActionScript", "Actor", "Ada", "Adenine", "Agda", "Agilent VEE", "Agora", "AIMMS", "Alef",
			"ALF", "ALGOL 58", "ALGOL 60", "ALGOL 68", "ALGOL W", "Alice", "Alma-0", "AmbientTalk", "Amiga E", "AMOS",
			"AMPL", "AngelScript", "AngularJS", "Apex", "APL", "App Inventor for Android's visual block language",
			"AppleScript", "Arc", "ARexx", "Argus", "AspectJ", "Assembly language", "ATS", "Ateji PX", "AutoHotkey",
			"AutoIt", "AutoLISP / Visual LISP", "Averest", "AWK", "Axum", "B", "Babbage", "Ballerina", "Bash", "BASIC",
			"Batch file (Windows/MSDOS)", "bc", "BCPL", "BeanShell", "Batch (Windows/Dos)", "Bertrand", "BETA",
			"Bigwig", "Bistro", "BitC", "BLISS", "Blockly", "BlooP", "Boo", "Boomerang",
			"Bourne shell (including bash and ksh)", "BPEL", "BREW", "BPEL4WS", "C", "C--", "C++", "C#", "C/AL",
			"Cache ObjectScript", "C Shell (csh)", "Caml", "Cayenne", "CDuce", "Cecil", "Cesil", "Ceylon", "CFEngine",
			"Cg", "Ch", "Chapel", "CHAIN", "Charity", "Charm", "CHILL", "CHIP-8", "Chomski", "ChucK", "Cilk",
			"CL (IBM)", "Claire", "Clarion", "Clean", "Clipper", "CLIPS", "CLIST", "Clojure", "CLU",
			"CMS EXEC (including REXX)", "COBOL", "Cobra", "CODE", "CoffeeScript", "Cola", "ColdFusion", "COMAL",
			"Combined Programming Language (CPL)", "COMIT", "Common Intermediate Language (CIL)",
			"Common Lisp (also known as CL)", "COMPASS", "Component Pascal", "Cool", "Coq", "Coral 66", "Corn",
			"CorVision", "COWSEL", "CPL", "Cryptol", "Crystal", "Csound", "CSP", "CUDA", "Curl", "Curry", "Cyclone",
			"Cypher Query Language", "D", "DASL", "DASL", "Dart", "DataFlex", "Datalog", "DATATRIEVE", "dBase", "dc",
			"DCL", "DDML", "Delphi", "DinkC", "DIBOL", "Dog", "Draco", "DRAKON", "Dylan", "DYNAMO",
			"DAX (Data Analysis Expressions)", "E", "Ease", "Easy PL/I", "EASYTRIEVE PLUS", "EC", "ECMAScript",
			"Edinburgh IMP", "EGL", "Eiffel", "ELAN", "Elixir", "Elm", "Emacs Lisp", "Emerald", "Emotion", "Epigram",
			"EPL (Easy Programming Language)", "EPL (Eltron Programming Language)", "Erlang", "es", "Escher", "ESPOL",
			"Esterel", "Etoys", "Euclid", "Euler", "Euphoria", "EusLisp Robot Programming Language",
			"CMS EXEC (EXEC2, EXEC2 40, EXEC2 50)", "EXEC", "EXEC 2", "EXEC 2", "Extempore", "F", "F#", "Factor",
			"Fantom", "FAUST", "Fjölnir", "FL", "Flavors", "Flex", "FlooP", "FLOW-MATIC", "FOCAL", "FOCUS", "FOIL",
			"FORMAC", "Formula", "Forth", "Fortran", "Fortress", "FoxBase", "FoxPro", "FP", "Franz Lisp", "F-Script",
			"G", "Game Maker Language (GML)", "GameMonkey Script", "GAMS", "GAP", "G-code", "GDScript", "Genie", "GDL",
			"GEORGE", "GLSL", "GNU E", "GNU Guile", "GNU Octave", "Golo", "GOM (Good Old Mad)", "Goo", "Gosu", "GPSS",
			"GraphTalk", "GRASS", "Grasshopper", "Groovy", "Hack", "HAGGIS", "HAL/S", "Hamilton C shell", "Harbour",
			"Hartmann pipelines", "Haskell", "Haxe", "High Level Assembly", "HLSL", "Hollywood", "Hope", "Hop",
			"Hopscotch", "HQ9+", "HTML", "Hume", "HyperTalk", "IBM BASIC assembly language", "IBM HAScript",
			"IBM Informix-4GL", "IBM RPG", "ICI", "Icon", "Id", "IDL", "Idris", "Inform", "Io", "Ioke", "IPL",
			"IPTSCRAE", "ISLISP", "ISPF", "ISWIM", "J", "J#", "J++", "JADE", "Jako", "JAL", "Janus", "JASS", "Java",
			"JavaFX Script", "JavaScript", "JCL", "JEAN", "Join Java", "JOSS", "Joule", "JOVIAL", "Joy", "JScript",
			"JScript .NET", "JSONiq", "JSP", "Julia", "Jython", "K", "Kaleidoscope", "Karel", "Karel++", "KEE",
			"Kixtart", "Klerer-May System", "KIF", "Kojo", "Kotlin", "KRC", "KRL", "KRYPTON", "Korn shell (ksh)", "L",
			"L# .NET", "LabVIEW", "Ladder", "Lagoona", "LANSA", "Lasso", "LaTeX", "Lava", "LC-3", "Leda", "Legoscript",
			"LIL", "LilyPond", "Limbo", "Limnor", "LINC", "Lingo", "LINQ", "LIS", "LISA", "Lisaac", "Lisp", "Lite-C",
			"Lithe", "Little b", "LLL", "Logo", "Logtalk", "Lotus", "LPC", "LSE", "LSL", "LiveCode", "LiveScript",
			"Lua", "Lucid", "Lustre", "LYaPAS", "M", "M#", "M2001", "M4", "Machine code", "MAD", "Mad/I", "Magik",
			"Magma", "make", "Maple", "MAPPER (aka MAPPER)", "MARK-IV (aka Informatics)", "Mary",
			"MASM Microsoft Assembly x86", "MATH-MATIC", "Mathematica", "MATLAB", "Max", "Maxima", "MaxScript",
			"Maya (MEL)", "MDL", "Mercury", "Mesa", "Metacard", "Metafont", "MetaL", "Microcode", "MicroScript", "MIIS",
			"MillScript", "MIMIC", "Mirah", "Miranda", "MIVA Script", "ML", "Moby", "Model 204", "Modelica", "Modula",
			"Modula-2", "Modula-3", "Mohol", "MOO", "Mortran", "Mouse", "MPD", "CIL", "MSL", "MUMPS",
			"Mystic Programming Language (MPL)", "NASM", "Napier88", "Neko", "Nemerle", "nesC", "NESL", "Net.Data",
			"NetLogo", "NetRexx", "NewLISP", "NEWP", "Newspeak", "NewtonScript", "Nial", "Nice", "Nickle (NITIN)",
			"Nim", "NPL", "Not eXactly C (NXC)", "Not Quite C (NQC)", "NSIS", "Nu", "NWScript", "NXT-G", "o:XML", "Oak",
			"Oberon", "OBJ2", "Object Lisp", "ObjectLOGO", "Object REXX", "Object Pascal", "Objective-C", "Objective-J",
			"Obliq", "OCaml", "Occam", "ooc", "Opa", "Opal", "OpenCL", "OpenEdge ABL", "OPL", "OPS5", "OptimJ", "Orc",
			"ORCA/Modula-2", "Oriel", "Orwell", "Oxygene", "Oz", "P", "P#", "ParaSail (programming language)",
			"PARI/GP", "Pascal", "Pawn", "PCASTL", "PCF", "PEARL", "PeopleCode", "Perl", "PDL", "Perl 6", "Pharo",
			"PHP", "Pico", "Picolisp", "Pict", "Pike", "PILOT", "Pipelines", "Pizza", "PL-11", "PL/0", "PL/B", "PL/C",
			"PL/I – ISO 6160", "PL/M", "PL/P", "PL/SQL", "PL360", "PLANC", "Plankalkül", "Planner", "PLEX", "PLEXIL",
			"Plus", "POP-11", "POP-2", "PostScript", "PortablE", "POV-Ray SDL", "Powerhouse",
			"PowerBuilder – 4GL GUI application generator from Sybase", "PowerShell", "PPL", "Processing",
			"Processing.js", "Prograph", "PROIV", "Prolog", "PROMAL", "Promela", "PROSE modeling language", "PROTEL",
			"ProvideX", "Pro*C", "Pure", "PureBasic", "Pure Data", "Python", "Q (programming language from Kx Systems)",
			"Q# (Microsoft programming language)", "Qalb", "QtScript", "QuakeC", "QPL", "R", "R++", "Racket", "RAPID",
			"Rapira", "Ratfiv", "Ratfor", "rc", "REBOL", "Red", "Redcode", "REFAL", "Reia", "REXX", "Rlab", "ROOP",
			"RPG", "RPL", "RSL", "RTL/2", "Ruby", "RuneScript", "Rust", "S", "S2", "S3", "S-Lang", "S-PLUS", "SA-C",
			"SabreTalk", "SAIL", "SALSA", "SAM76", "SAS", "SASL", "Sather", "Sawzall", "Scala", "Scheme", "Scilab",
			"Scratch", "Script.NET", "sed", "Seed7", "Self", "SenseTalk", "SequenceL", "SETL", "Shift Script", "SIMPOL",
			"SIGNAL", "SiMPLE", "SIMSCRIPT", "Simula", "Simulink", "Singularity", "SISAL", "SLIP", "SMALL", "Smalltalk",
			"SML", "Snap!", "SNOBOL", "Snowball", "SOL", "Solidity", "SOPHAEROS", "Source", "SPARK", "Speedcode",
			"SPIN", "SP/k", "SPS", "SQL", "SQR", "Squeak", "Squirrel", "SR", "SRAM", "S/SL", "Starlogo", "Strand",
			"Stata", "Stateflow", "Subtext", "Suneido", "SuperCollider", "SuperTalk", "Swift",
			"Swift (parallel scripting language)", "SYMPL", "SystemVerilog", "T", "TACL", "TACPOL", "TADS", "TAL",
			"Tcl", "Tea", "TECO", "TELCOMP", "TeX", "TEX", "TIE", "TMG", "Tom", "TOM", "Toi", "Topspeed", "TPU", "Trac",
			"TTM", "T-SQL", "TTCN", "Turing", "TUTOR", "TXL", "TypeScript", "Ubercode", "UCSD Pascal", "Umple",
			"Unicon", "Uniface", "UNITY", "Unix shell", "UnrealScript", "Vala", "VBA", "VBScript", "Verilog", "VHDL",
			"Vim script", "Viper", "Visual Basic", "Visual Basic .NET (VB.NET)", "Visual DataFlex",
			"Visual DialogScript", "Visual Fortran", "Visual FoxPro", "Visual J++", "Visual J#", "Visual LISP",
			"Visual Objects", "Visual Prolog", "VSXu", "Vvvv", "WATFIV, WATFOR", "WebAssembly", "WebDNA", "WebQL",
			"Whiley", "Winbatch", "Wolfram", "Wyvern", "X++", "X#", "X10", "XBL", "XC", "Xojo", "XOTcl", "XPL", "XPL0",
			"XQuery", "XSB", "XSharp", "XSLT", "XPath", "XQuery", "Xtend", "YACC", "Yorick", "YQL", "Yoix", "YUI",
			"Z notation", "Zebra", "Zeno", "ZetaLisp", "Zig", "ZOPL", "ZPL", "Z++", "Zsh", "ZPL", "ZX81 BASIC"

	};
}