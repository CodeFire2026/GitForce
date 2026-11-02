
function createTaskManager() {
    let tasks = [];
    let nextId = 1;

    return {
        addTask: function(task) {
            tasks.push({
                id: nextId++,
                name: task,
                completed: false
            });
        },

        completeTask: function(taskId) {
            const task = tasks.find(t => t.id === taskId);

            if (task) {
                task.completed = true;
                return true;
            }

            return false;
        },

        listTasks: function() {
            tasks.forEach(task => {
                console.log(
                    "ID:", task.id,
                    "| Tarea:", task.name,
                    "| Estado:", task.completed ? "Completada" : "Pendiente"
                );
            });
        }
    };
}

// Uso:
const myTasks = createTaskManager();

myTasks.addTask("Aprender JavaScript");
myTasks.addTask("Hacer ejercicio");

myTasks.listTasks();

console.log("----------------------");

myTasks.completeTask(1);

myTasks.listTasks();
