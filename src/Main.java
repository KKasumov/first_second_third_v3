import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Foo foo = new Foo();

        CompletableFuture<Void> futureA = foo.firstAsync();
        CompletableFuture<Void> futureB = futureA.thenCompose((Void) -> foo.secondAsync());
        CompletableFuture<Void> futureC = futureB.thenCompose((Void) -> foo.thirdAsync());

        futureC.get(); // Ожидание выполнения всех задач
    }
}

/*
Этот класс создает экземпляр Foo и последовательно вызывает асинхронные методы
firstAsync(), secondAsync() и thirdAsync(), используя thenCompose()
для определения порядка выполнения.
Затем он ожидает завершения всех задач, вызывая get() на финальном CompletableFuture.

Метод `thenCompose()` является одним из методов класса `CompletableFuture` в Java,
который предоставляет возможность композиции асинхронных операций.
Он принимает в качестве параметра функцию, которая преобразует результат выполнения
предыдущей операции в другой `CompletableFuture`.
Таким образом, `thenCompose()` позволяет комбинировать последовательные
асинхронные операции, где каждая следующая операция зависит от результата предыдущей.
Функция, переданная в `thenCompose()`, должна возвращать новый объект `CompletableFuture`.
Этот новый `CompletableFuture` будет ассоциирован с завершением
предыдущего `CompletableFuture` и будет запущен автоматически после его завершения.

Ключевая особенность метода `thenCompose()` заключается в том,
что он позволяет плоское цепочное составление асинхронных операций,
в отличие от метода `thenApply()`, который возвращает `CompletableFuture`
с параметризацией другого типа.

Таким образом, использование `thenCompose()` позволяет более гибко
и эффективно управлять последовательностью выполнения асинхронных операций
и обрабатывать результаты каждой операции перед передачей управления следующей.
*/
