# FPInterpreter
John Backus' FP language interpreter (together with denotational semantics for the language)

Sample functions in John Backus' "program algebra" style:

factorial definition in "program algebra" style:
<pre>DEF factNonRecursive = INSERT-RIGHT * . iota</pre>

factorial definition in lambda calculus style:
<pre> DEF fact = (eq0 -> ~1; * . [id, fact . s]) </pre>

length definition in "program algebra" style:
<pre> DEF length = INSERT-RIGHT + . APPLY-ALL ~1 </pre>

