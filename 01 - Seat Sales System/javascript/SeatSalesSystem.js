let seats = [];
let tic = false;
let row, seat, answer, map;

for (let r = 0; r < 10; r++) {
    for (let s = 0; s < 10; s++) {
        seats[r][s] = 'L';
    }
}

console.log("Seat reservation system");

while (tic != true) {
Inicio
    map = prompt("Do you want to see a seating map? (Y/N)")
    if (map.toUpperCase() == "Y" || map.toUpperCase() == "S" || map.toUpperCase() == "Yes" || map.toUpperCase() == "Si") {
        for (let r = 0; r < 10; r++) {
            console.log(seats[r]);
        }
    }
    let ok = false;
    while (ok != true) {

        console.log("Select row and seat");
        row = prompt("Row(0-9)");
        seat = prompt("Seat(0-9)");
        if (row >= 0 || row <= 9) {
            if (row >= 0 || row <= 9) {
                ok = true;
            }
            else {
                console.log("Invalid Seat Number (0-9).");
            }
        }
        else {
            console.log("Invalid row Number (0-9).");
        }
    }
    if (seats[row][seat] == 'L') {
        seats[row][seat] = 'X';
        console.log("The seat was reserved correctly.");
    }
    else {
        console.log("The seat is occupied.Please choose another one.");
    }
    answer = prompt("Do you want to continue with the reservation? (Y/N)");
    if (answer.toLocaleUpperCase == "N" || answer.toLocaleUpperCase == "NO") {
        tic = true;
    }
}
