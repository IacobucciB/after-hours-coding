document.addEventListener('DOMContentLoaded', () => {
    const projects = [
        { title: "Proyecto 1", date: "2024-01-01", description: "Descripción del Proyecto 1" },
        { title: "Proyecto 2", date: "2024-02-15", description: "Descripción del Proyecto 2" },
        // Agrega más proyectos según sea necesario
    ];

    const projectList = document.getElementById('projectList');
    const searchBar = document.getElementById('searchBar');

    function displayProjects(filter = '') {
        projectList.innerHTML = '';
        const filteredProjects = projects.filter(project => 
            project.title.toLowerCase().includes(filter.toLowerCase()) || 
            project.description.toLowerCase().includes(filter.toLowerCase())
        );
        filteredProjects.forEach(project => {
            const projectItem = document.createElement('div');
            projectItem.classList.add('project-item');
            projectItem.innerHTML = `
                <h3>${project.title}</h3>
                <p><strong>Fecha:</strong> ${project.date}</p>
                <p>${project.description}</p>
            `;
            projectList.appendChild(projectItem);
        });
    }

    searchBar.addEventListener('input', (e) => {
        displayProjects(e.target.value);
    });

    displayProjects();
});
