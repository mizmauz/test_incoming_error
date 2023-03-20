# test_incoming_error

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

# Error
SRMSG00212: Unable to initialize mediator: process2: java.lang.NullPointerException: Bean is null
at java.base/java.util.Objects.requireNonNull(Objects.java:233)

With 2 @incoming annotations ins WeightsProcessor the following error comes up on build:
8:20:35 WARN  traceId=, parentId=, spanId=, sampled= [or.ap.ka.cl.co.ConsumerConfig] (smallrye-kafka-consumer-thread-1) These configurations '[propagate-headers]' were supplied but are not used yet.
08:20:35 ERROR traceId=, parentId=, spanId=, sampled= [io.sm.re.me.provider] (Quarkus Main Thread) SRMSG00212: Unable to initialize mediator: process2: java.lang.NullPointerException: Bean is null
at java.base/java.util.Objects.requireNonNull(Objects.java:233)
at io.quarkus.arc.impl.BeanManagerImpl.getReference(BeanManagerImpl.java:57)
at io.smallrye.reactive.messaging.providers.extension.MediatorManager.createMediator(MediatorManager.java:176)
at io.smallrye.reactive.messaging.providers.extension.MediatorManager_ClientProxy.createMediator(Unknown Source)
at io.smallrye.reactive.messaging.providers.wiring.Wiring$SubscriberMediatorComponent.materialize(Wiring.java:626)
at io.smallrye.reactive.messaging.providers.wiring.Graph.lambda$materialize$10(Graph.java:100)
at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
at io.smallrye.reactive.messaging.providers.wiring.Graph.materialize(Graph.java:99)
at io.smallrye.reactive.messaging.providers.extension.MediatorManager.start(MediatorManager.java:219)
at io.smallrye.reactive.messaging.providers.extension.MediatorManager_ClientProxy.start(Unknown Source)
at io.quarkus.smallrye.reactivemessaging.runtime.SmallRyeReactiveMessagingLifecycle.onApplicationStart(SmallRyeReactiveMessagingLifecycle.java:52)
at io.quarkus.smallrye.reactivemessaging.runtime.SmallRyeReactiveMessagingLifecycle_Observer_onApplicationStart_7f54e4b27c1b49e5e062caa58f1e82797fa01393.notify(Unknown Source)
at io.quarkus.arc.impl.EventImpl$Notifier.notifyObservers(EventImpl.java:328)
at io.quarkus.arc.impl.EventImpl$Notifier.notify(EventImpl.java:310)
at io.quarkus.arc.impl.EventImpl.fire(EventImpl.java:78)
at io.quarkus.arc.runtime.ArcRecorder.fireLifecycleEvent(ArcRecorder.java:131)
at io.quarkus.arc.runtime.ArcRecorder.handleLifecycleEvents(ArcRecorder.java:100)
at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy_0(Unknown Source)
at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy(Unknown Source)
at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
at io.quarkus.runtime.Application.start(Application.java:101)
at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:108)
at io.quarkus.runtime.Quarkus.run(Quarkus.java:71)
at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
at io.quarkus.runner.GeneratedMain.main(Unknown Source)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.base/java.lang.reflect.Method.invoke(Method.java:568)
at io.quarkus.runner.bootstrap.StartupActionImpl$1.run(StartupActionImpl.java:104)
at java.base/java.lang.Thread.run(Thread.java:833)

08:20:35 ERROR traceId=, parentId=, spanId=, sampled= [io.qu.ru.Application] (Quarkus Main Thread) Failed to start application (with profile [dev]): java.lang.NullPointerException: Bean is null
at java.base/java.util.Objects.requireNonNull(Objects.java:233)
at io.quarkus.arc.impl.BeanManagerImpl.getReference(BeanManagerImpl.java:57)
at io.smallrye.reactive.messaging.providers.extension.MediatorManager.createMediator(MediatorManager.java:176)
at io.smallrye.reactive.messaging.providers.extension.MediatorManager_ClientProxy.createMediator(Unknown Source)
at io.smallrye.reactive.messaging.providers.wiring.Wiring$SubscriberMediatorComponent.materialize(Wiring.java:626)
at io.smallrye.reactive.messaging.providers.wiring.Graph.lambda$materialize$10(Graph.java:100)
at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
at io.smallrye.reactive.messaging.providers.wiring.Graph.materialize(Graph.java:99)
at io.smallrye.reactive.messaging.providers.extension.MediatorManager.start(MediatorManager.java:219)
at io.smallrye.reactive.messaging.providers.extension.MediatorManager_ClientProxy.start(Unknown Source)
at io.quarkus.smallrye.reactivemessaging.runtime.SmallRyeReactiveMessagingLifecycle.onApplicationStart(SmallRyeReactiveMessagingLifecycle.java:52)
at io.quarkus.smallrye.reactivemessaging.runtime.SmallRyeReactiveMessagingLifecycle_Observer_onApplicationStart_7f54e4b27c1b49e5e062caa58f1e82797fa01393.notify(Unknown Source)
at io.quarkus.arc.impl.EventImpl$Notifier.notifyObservers(EventImpl.java:328)
at io.quarkus.arc.impl.EventImpl$Notifier.notify(EventImpl.java:310)
at io.quarkus.arc.impl.EventImpl.fire(EventImpl.java:78)
at io.quarkus.arc.runtime.ArcRecorder.fireLifecycleEvent(ArcRecorder.java:131)
at io.quarkus.arc.runtime.ArcRecorder.handleLifecycleEvents(ArcRecorder.java:100)
at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy_0(Unknown Source)
at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy(Unknown Source)
at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
at io.quarkus.runtime.Application.start(Application.java:101)
at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:108)
at io.quarkus.runtime.Quarkus.run(Quarkus.java:71)
at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
at io.quarkus.runner.GeneratedMain.main(Unknown Source)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.base/java.lang.reflect.Method.invoke(Method.java:568)
at io.quarkus.runner.bootstrap.StartupActionImpl$1.run(StartupActionImpl.java:104)
at java.base/java.lang.Thread.run(Thread.java:833)




```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/test_incoming_error-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.
