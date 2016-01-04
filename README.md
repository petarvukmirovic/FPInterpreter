# FPInterpreter
John Backus' FP language interpreter (together with denotational semantics for the language)

This project includes both GUI front end for the interpreter and 
REPL command-line front-end.

Sample functions in John Backus' "program algebra" style:

factorial definition in "program algebra" style:
<pre>DEF factNonRecursive = INSERT-RIGHT * . iota</pre>

factorial definition in lambda calculus style:
<pre> DEF fact = (eq0 -> ~1; * . [id, fact . s]) </pre>

length definition in "program algebra" style:
<pre> DEF length = INSERT-RIGHT + . APPLY-ALL ~1 </pre>


Built with IntelliJ Idea 15.
