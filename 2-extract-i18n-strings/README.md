At this step, we'll extract i18n strings from Scala source code.

See build.sbt to know how
[scala-xgettext](https://github.com/xitrum-framework/scala-xgettext)
is included to this project.

To extract i18n strings, create an empty file named `i18n.pot` and recompile:

```
rm i18n.pot
touch i18n.pot
sbt clean
sbt compile
```

`i18n.pot` will be filled with i18n strings extracted from Scala source code.
They are extracted by
[scala-xgettext](https://github.com/xitrum-framework/scala-xgettext)
Scala compiler plugin at compile time.

Rename or copy `i18n.pot` to `<lang>.po` and use
[Poedit](https://poedit.net/)
to translate.

To run:

```
sbt run
```
