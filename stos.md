
# Stos aktywnosci

## 1. Uruchomienie aplikacji

Na stosie znajduje sie ekran 1.

```text
[MainActivity]
```

## 2. Przejscie ekran 1 -> ekran 2

Drugi ekran zostaje dodany na szczyt stosu.

```text
[SummaryActivity] <- szczyt
[MainActivity]
```

## 3. Nacisniecie Wstecz

Drugi ekran zostaje zamkniety. Wracamy do pierwszego.

```text
[MainActivity] <- szczyt
```

## 4. Przejscie do ekranu 3

Ekran O aplikacji zostaje dodany na stos.

```text
[AboutActivity] <- szczyt
[MainActivity]
```

## 5. Pierwsze Wstecz

Ekran O aplikacji zostaje zamkniety.

```text
[MainActivity] <- szczyt
```

## 6. Drugie Wstecz

Pierwszy ekran zostaje zamkniety i aplikacja przechodzi do poprzedniej aplikacji lub ekranu glównego.

```text
Stos aplikacji jest pusty.
```

## Wnioski

Przy przechodzeniu do kolejnych aktywnosci Android dodaje je na szczyt stosu. Przycisk Wstecz zamyka aktualna aktywnosc i wraca do poprzedniej. W tym zadaniu nie uzywamy FLAG_ACTIVITY_CLEAR_TOP ani innych flag zmieniajacych stos.
