This is a gradle plugin for moco.

Usage
========

- Start moco server

```
gradle startMoco

```

- Stop moco server

```
gradle stopMoco

```

- Configuration

In startMoco, you could have following properties to be used to configure your Moco:

```
configFile: to specify your json file

daemon: like JettyPlugin, if it's true, then Moco will run in the background.

```
