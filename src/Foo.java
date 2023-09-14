import java.util.concurrent.CompletableFuture;

public class Foo {
    public Foo() {

    }

    public CompletableFuture<Void> firstAsync() {
        System.out.print("first");
        return CompletableFuture.completedFuture(null);
    }

    public CompletableFuture<Void> secondAsync() {
        System.out.print("second");
        return CompletableFuture.completedFuture(null);
    }

    public CompletableFuture<Void> thirdAsync() {
        System.out.print("third");
        return CompletableFuture.completedFuture(null);
    }
}

/*
Этот код представляет класс `Foo`, который содержит три метода,
каждый из которых возвращает `CompletableFuture<Void>`.

   `firstAsync()`
Выводит `first` на консоль возвращает завершенный `CompletableFuture<Void>`.

    `secondAsync()` метод:
Выводит `second` на консоль и возвращает завершенный `CompletableFuture<Void>`.

     `thirdAsync()` метод:
Выводит `third` на консоль и возвращает завершенный `CompletableFuture<Void>`.

Таким образом, вызывая методы `firstAsync()`, `secondAsync()` и `thirdAsync()`
в порядке их объявления, они будут последовательно выводить
строки `first`, `second` и `third` на консоль.
Это асинхронные методы, которые возвращают `CompletableFuture`,
позволяя вам выполнять дополнительные асинхронные операции или ожидать их завершения,
если необходимо.

`CompletableFuture` - это класс в стандартной библиотеке Java,
предоставляющий мощные возможности для работы с асинхронными операциями и обработки результатов.
Он представляет собой реализацию асинхронного программирования на основе промисов (promises)
и фьючерсов (futures).

В отличие от обычных промисов и фьючерсов, `CompletableFuture` обладает рядом преимуществ:

1. Комбинирование и композиция: `CompletableFuture` обладает широким спектром методов,
которые позволяют комбинировать и композировать асинхронные операции.
Например, можно последовательно или параллельно объединять несколько `CompletableFuture`
и выполнять операции над их результатами.

2. Обработка ошибок: `CompletableFuture` предоставляет удобные методы для обработки
и перехвата исключений, возникающих в процессе выполнения асинхронных операций.

3. Контроль над выполнением: `CompletableFuture` предоставляет возможность управлять
выделением ресурсов и выполнением операций в различных исполнительных сервисах.

4. Возможность выполнения обратных вызовов: `CompletableFuture` позволяет присоединять
обратные вызовы, которые будут выполнены при завершении асинхронной операции.

5. Гибкость: `CompletableFuture` является частью более общего фреймворка
CompletableFuture API, который включает в себя и другие классы для работы с асинхронными операциями.

Благодаря этим возможностям `CompletableFuture` стал мощным инструментом
для работы с асинхронным кодом в Java, упрощающим разработку эффективных
и отзывчивых приложений.
*/