# DSL
Das ist der Client, der mit der DSL (Domain Specific Language) md² generiert wird.

## Hinweise

In Eclipse:  
  Wenn der Code nicht automatisch generiert wird hilft es unter *Project* den Haken bei *Build Automatically* zu entfernen und dann manuell den Build zu starten (*Build Project*).
  
In Android Studio:  
Probleme mit dem generierten Code können behoben werden, indem man die gradle-Version richtig einstellt.
Außerdem gibt es bei der Klasse FirstWFE___FirstWFE_startupAction_Action folgende Ersetzung zu machen:  
FirstWFE___~~F~~**f**irstWFE_startupAction_Action  
In der Manifestdatei muss der Name der app noch angepasst werden. Vorher muss ggf. *clean Project* ausgeführt werden.
    
## Kurzbeschreibung der Aufgabe

Es soll eine App entstehen, die mittels REST-Schnittstelle Dateien auf einen Server Laden kann und runterladen.
Ggf. soll es möglich sein Fotos zu machen und diese hochzuladen.  
  
Die Entwicklung soll so weit wie möglich ausschließlich mit der DSL md² erfolgen.
